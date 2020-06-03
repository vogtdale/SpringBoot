INSERT INTO `users` (`id`, `email`, `gender`, `password`, `surname`, `username`) VALUES ('1', 'dalo@dalo.fr', 'M', '$2y$12$OeeDr5FKstTGz.lz7wxHeeeoz49HWUODzxVe4rldaT7zngSKqXKkO', 'vogt', 'dalo');

INSERT INTO `users` (`id`, `email`, `gender`, `password`, `surname`, `username`) VALUES ('2', 'admino@meetups.fr', 'M', '$2y$12$OeeDr5FKstTGz.lz7wxHeeeoz49HWUODzxVe4rldaT7zngSKqXKkO', 'admin', 'admin');


INSERT INTO `roles` (`id`, `name`) VALUES ('1', 'ROLE_ADMIN'), ('2', 'ROLE_USER');


INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES ('1', '1'), ('1', '2');


INSERT INTO `events` (`events_id`, `date`, `description`, `messages`, `title`) VALUES ('1', '2020-06-17', 'April fools day picknick ', 'Come all to our april fools day picknick', 'April fools day');

INSERT INTO `genres` (`id`, `description`, `title`) VALUES ('1', 'Rock n Roll Band Discussion ', 'Eock n Roll'), ('2', 'Food and wine Discussion', 'Gastronomy');

INSERT INTO `groups` (`groupe_id`, `title`, `genre_id`) VALUES ('1', 'Rock n Roll Discussion', '1');



