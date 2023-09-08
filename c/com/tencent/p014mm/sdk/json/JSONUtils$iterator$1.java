package com.tencent.p014mm.sdk.json;

import hy3.C33145a;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONArray;

@Metadata(mo182093d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, mo182094d2 = {"com/tencent/mm/sdk/json/JSONUtils$iterator$1", "", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.json.JSONUtils$iterator$1 */
public final class JSONUtils$iterator$1 implements Iterator<Object>, C33145a {
    public final /* synthetic */ JSONArray $arr;
    private int index;

    public JSONUtils$iterator$1(JSONArray jSONArray) {
        this.$arr = jSONArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$arr.length();
    }

    public Object next() {
        Object obj = this.$arr.get(this.index);
        this.index++;
        return obj;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
