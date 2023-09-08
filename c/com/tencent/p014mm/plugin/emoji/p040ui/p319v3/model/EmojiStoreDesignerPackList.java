package com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model;

import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import te3.C101824o80;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreDesignerPackList;", "", "", "Lte3/o80;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "", "reqBuffer", "[B", "getReqBuffer", "()[B", "setReqBuffer", "([B)V", "<init>", "(Ljava/util/List;[B)V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreDesignerPackList */
public final class EmojiStoreDesignerPackList {
    public static final int $stable = 8;
    private final List<C101824o80> dataList;
    private byte[] reqBuffer;

    public EmojiStoreDesignerPackList() {
        this((List) null, (byte[]) null, 3, (C8480h) null);
    }

    public EmojiStoreDesignerPackList(List<? extends C101824o80> list, byte[] bArr) {
        C87412m.m108594g(list, "dataList");
        this.dataList = list;
        this.reqBuffer = bArr;
    }

    public final List<C101824o80> getDataList() {
        return this.dataList;
    }

    public final byte[] getReqBuffer() {
        return this.reqBuffer;
    }

    public final void setReqBuffer(byte[] bArr) {
        this.reqBuffer = bArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmojiStoreDesignerPackList(List list, byte[] bArr, int i, C8480h hVar) {
        this((i & 1) != 0 ? new LinkedList() : list, (i & 2) != 0 ? null : bArr);
    }
}
