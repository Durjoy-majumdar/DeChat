package com.tencent.p014mm.xeffect.data;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/data/Event;", "", "name", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getName", "setName", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
/* renamed from: com.tencent.mm.xeffect.data.Event */
public final class Event {
    private String description = "";
    private String name = "";

    public Event(String str, String str2) {
        if (str != null) {
            this.name = str;
        }
        if (str2 != null) {
            this.description = str2;
        }
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final void setDescription(String str) {
        C87412m.m108595h(str, "<set-?>");
        this.description = str;
    }

    public final void setName(String str) {
        C87412m.m108595h(str, "<set-?>");
        this.name = str;
    }
}
