package com.test.practice.rest.Messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.test.practice.rest.Messenger.model.Message;
import com.test.practice.rest.Messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

}
