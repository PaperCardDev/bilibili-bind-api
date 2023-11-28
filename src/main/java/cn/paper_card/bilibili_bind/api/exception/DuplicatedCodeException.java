package cn.paper_card.bilibili_bind.api.exception;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class DuplicatedCodeException extends Exception {
    public DuplicatedCodeException(@NotNull String message) {
        super(message);
    }
}
