package net.xonich.olorin.dto;

import net.xonich.olorin.domain.Status;

public record Response<T>(Status status, T body, String msg) {
    public static <T> Response<T> of(T body) {
        return new Response<>(Status.OK, body, null);
    }

    public static <T> Response<T> error(String msg) {
        return new Response<>(Status.ERROR, null, msg);
    }
}
