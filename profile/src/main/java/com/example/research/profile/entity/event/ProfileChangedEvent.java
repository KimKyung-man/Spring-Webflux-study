package com.example.research.profile.entity.event;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProfileChangedEvent {
  @Getter public static final String TAG = ProfileChangedEvent.class.getSimpleName();

  @NonNull String name;
  @NonNull Integer age;
  @NonNull String sex; // man, woman
  @NonNull LocalDateTime createdAt;
}
