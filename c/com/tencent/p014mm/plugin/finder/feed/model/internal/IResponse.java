package com.tencent.p014mm.plugin.finder.feed.model.internal;

import gy3.C8480h;
import java.util.List;
import kotlin.Metadata;
import pe3.C89349b;
import te3.C50985qn1;
import tf1.C13914m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B'\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R$\u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010!¨\u0006="}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Ltf1/m;", "T", "", "", "errType", "I", "getErrType", "()I", "errCode", "getErrCode", "", "errMsg", "Ljava/lang/String;", "getErrMsg", "()Ljava/lang/String;", "", "incrementList", "Ljava/util/List;", "getIncrementList", "()Ljava/util/List;", "setIncrementList", "(Ljava/util/List;)V", "Lpe3/b;", "lastBuffer", "Lpe3/b;", "getLastBuffer", "()Lpe3/b;", "setLastBuffer", "(Lpe3/b;)V", "pullType", "getPullType", "setPullType", "(I)V", "", "hasMore", "Z", "getHasMore", "()Z", "setHasMore", "(Z)V", "isNeedClear", "setNeedClear", "request", "Ljava/lang/Object;", "getRequest", "()Ljava/lang/Object;", "setRequest", "(Ljava/lang/Object;)V", "Lte3/qn1;", "bgmInfo", "Lte3/qn1;", "getBgmInfo", "()Lte3/qn1;", "setBgmInfo", "(Lte3/qn1;)V", "refreshInterval", "getRefreshInterval", "setRefreshInterval", "<init>", "(IILjava/lang/String;)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.IResponse */
public class IResponse<T extends C13914m> {
    private C50985qn1 bgmInfo;
    private final int errCode;
    private final String errMsg;
    private final int errType;
    private boolean hasMore;
    private List<? extends T> incrementList;
    private boolean isNeedClear;
    private C89349b lastBuffer;
    private int pullType;
    private int refreshInterval;
    private Object request;

    public IResponse() {
        this(0, 0, (String) null, 7, (C8480h) null);
    }

    public IResponse(int i, int i2, String str) {
        this.errType = i;
        this.errCode = i2;
        this.errMsg = str;
        this.pullType = -1;
        this.hasMore = true;
        this.isNeedClear = true;
        this.refreshInterval = -1;
    }

    public final C50985qn1 getBgmInfo() {
        return this.bgmInfo;
    }

    public final int getErrCode() {
        return this.errCode;
    }

    public final String getErrMsg() {
        return this.errMsg;
    }

    public final int getErrType() {
        return this.errType;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<T> getIncrementList() {
        return this.incrementList;
    }

    public final C89349b getLastBuffer() {
        return this.lastBuffer;
    }

    public final int getPullType() {
        return this.pullType;
    }

    public final int getRefreshInterval() {
        return this.refreshInterval;
    }

    public final Object getRequest() {
        return this.request;
    }

    public final boolean isNeedClear() {
        return this.isNeedClear;
    }

    public final void setBgmInfo(C50985qn1 qn12) {
        this.bgmInfo = qn12;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setIncrementList(List<? extends T> list) {
        this.incrementList = list;
    }

    public final void setLastBuffer(C89349b bVar) {
        this.lastBuffer = bVar;
    }

    public final void setNeedClear(boolean z) {
        this.isNeedClear = z;
    }

    public final void setPullType(int i) {
        this.pullType = i;
    }

    public final void setRefreshInterval(int i) {
        this.refreshInterval = i;
    }

    public final void setRequest(Object obj) {
        this.request = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IResponse(int i, int i2, String str, int i3, C8480h hVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str);
    }
}
