package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.statecenter.BaseState;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u001d\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0016R;\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0018j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineState;", "Lcom/tencent/mm/sdk/statecenter/BaseState;", "", "key", "", "obj", "Lrx3/b0;", "put", "defaultValue", "getString", "getStringOrInterrupt", "", "getInt", "getIntOrInterrupt", "", "getLong", "getLongOrInterrupt", "", "getFloat", "getFloatOrInterrupt", "T", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrInterrupt", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "dataMap$delegate", "Lrx3/g;", "getDataMap", "()Ljava/util/HashMap;", "dataMap", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.PipelineState */
public class PipelineState extends BaseState {
    private final C13601g dataMap$delegate = C36568h.m40985a(PipelineState$dataMap$2.INSTANCE);

    private final HashMap<String, Object> getDataMap() {
        return (HashMap) this.dataMap$delegate.getValue();
    }

    public Object clone() {
        return super.clone();
    }

    public final <T> T get(String str) {
        C87412m.m108594g(str, "key");
        return getDataMap().get(str);
    }

    public final float getFloat(String str, float f) {
        C87412m.m108594g(str, "key");
        Object obj = getDataMap().get(str);
        return obj instanceof Float ? ((Number) obj).floatValue() : f;
    }

    public final float getFloatOrInterrupt(String str) {
        C87412m.m108594g(str, "key");
        Object obj = getDataMap().get(str);
        if (obj instanceof Float) {
            return ((Number) obj).floatValue();
        }
        throw new IllegalArgumentException(str);
    }

    public final int getInt(String str, int i) {
        C87412m.m108594g(str, "key");
        Object obj = getDataMap().get(str);
        return obj instanceof Integer ? ((Number) obj).intValue() : i;
    }

    public final int getIntOrInterrupt(String str) {
        C87412m.m108594g(str, "key");
        Object obj = getDataMap().get(str);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalArgumentException(str);
    }

    public final long getLong(String str, long j) {
        C87412m.m108594g(str, "key");
        Object obj = getDataMap().get(str);
        return obj instanceof Long ? ((Number) obj).longValue() : j;
    }

    public final long getLongOrInterrupt(String str) {
        C87412m.m108594g(str, "key");
        Object obj = getDataMap().get(str);
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        throw new IllegalArgumentException(str);
    }

    public final <T> T getOrInterrupt(String str) {
        C87412m.m108594g(str, "key");
        T t = get(str);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    public final String getString(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "defaultValue");
        Object obj = getDataMap().get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public final String getStringOrInterrupt(String str) {
        C87412m.m108594g(str, "key");
        Object obj = getDataMap().get(str);
        if ((obj instanceof String) && (!C112551y.m153811k((CharSequence) obj))) {
            return (String) obj;
        }
        throw new IllegalArgumentException(str);
    }

    public final void put(String str, Object obj) {
        C87412m.m108594g(str, "key");
        getDataMap().put(str, obj);
    }
}
