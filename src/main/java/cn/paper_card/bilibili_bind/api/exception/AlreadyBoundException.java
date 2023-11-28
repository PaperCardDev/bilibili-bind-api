package cn.paper_card.bilibili_bind.api.exception;

import cn.paper_card.bilibili_bind.api.BindInfo;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class AlreadyBoundException extends Exception {
    private final @NotNull BindInfo bindInfo;

    public AlreadyBoundException(@NotNull BindInfo bindInfo, @NotNull String message) {
        super(message);
        this.bindInfo = bindInfo;
    }

    public @NotNull BindInfo getBindInfo() {
        return this.bindInfo;
    }
}
