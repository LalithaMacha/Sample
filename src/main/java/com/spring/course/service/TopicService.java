package com.spring.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.course.entity.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Core Java","Java Description"),
		    new Topic("MySQL","MySQL","MySQL Description")
		    ));	
	public List<Topic> getData(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id,Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
		
	}
	
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t ->t.getId().equals(id));
		
	}

	 
	

}
