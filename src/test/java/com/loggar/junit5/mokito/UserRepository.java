package com.loggar.junit5.mokito;

public interface UserRepository {
  User insert(User user);

  boolean isUsernameAlreadyExists(String userName);
}
