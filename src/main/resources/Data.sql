INSERT INTO post(id, title          , description             , content                            , created_at       , updated_at       )
VALUE           (1 , "Java Advanced", "Learn Spring Framework", "Learn Spring FrameWork with Kenzy", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO comment(id, name  , email               , body              , created_at       , updated_at       , post_id)
VALUE              (1 , "Nghị", "tobanghi@gmail.com", "Bài viết như cứt", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1      );