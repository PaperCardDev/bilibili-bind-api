package cn.paper_card.bilibili_bind.api;

public record PreLoginResponse(
        boolean allowed,
        Object kickMessage
) {
}
