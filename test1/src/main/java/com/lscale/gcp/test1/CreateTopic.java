package com.lscale.gcp.test1;

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

    public static void main(String[] args) throws IOException {
        tryIt();
    }
}
