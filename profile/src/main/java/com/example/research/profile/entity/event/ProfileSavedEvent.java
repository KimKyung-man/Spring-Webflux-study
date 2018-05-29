package com.example.research.profile.entity.event;

import com.example.research.profile.entity.storage.Profile;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public class ProfileSavedEvent implements ProfileEvent {
  public static final String TAG = ProfileSavedEvent.class.getSimpleName();

  @NonNull String id;
  @NonNull String name;
  @NonNull Integer age;
  @NonNull String sex; // man, woman
  @NonNull LocalDateTime createdAt;

  public static ProfileSavedEvent from(Profile storeProfile) {
    return new ProfileSavedEvent(
        storeProfile.getId(),
        storeProfile.getName(), storeProfile.getAge(),
        storeProfile.getSex(), storeProfile.getCreatedAt()
    );
  }

  @Override public String getTag() {
    return TAG;
  }
}
