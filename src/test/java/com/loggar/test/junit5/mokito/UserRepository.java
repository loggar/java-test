package com.loggar.test.junit5.mokito;

public interface UserRepository {
  User insert(User user);

  boolean isUsernameAlreadyExists(String userName);
}
