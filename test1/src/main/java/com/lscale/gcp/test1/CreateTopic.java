package com.lscale.gcp.test1;

import com.google.cloud.ServiceOptions;
import com.google.cloud.pubsub.spi.v1.TopicAdminClient;
import com.google.pubsub.v1.Topic;
import com.google.pubsub.v1.TopicName;

import java.io.IOException;

// https://cloud.google.com/pubsub/docs/publisher#pubsub-publish-java
public class CreateTopic {

    public static Topic tryIt() throws IOException {
        try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
            String projectId = "johan-w-test1";
            String topicId = "my-topic-id";
            TopicName topicName = TopicName.create(projectId, topicId);
            Topic topic = topicAdminClient.createTopic(topicName);
            return topic;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void tryIt2() throws Exception {
        // Your Google Cloud Platform project ID
        String projectId = ServiceOptions.getDefaultProjectId();

        // Your topic ID
        String topicId = "my-new-topic";

        // Create a new topic
        TopicName topic = TopicName.create(projectId, topicId);
        try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
            topicAdminClient.createTopic(topic);
        }

        System.out.printf("Topic %s:%s created.\n", topic.getProject(), topic.getTopic());
    }

    public static void main(String[] args) throws IOException {
        tryIt();
    }
}
