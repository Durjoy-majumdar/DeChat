package v92;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import gy3.C87412m;
import jq3.C9493c;

/* renamed from: v92.a */
public final class C65558a implements C9493c {

    /* renamed from: d */
    public final MultiTaskInfo f188631d;

    public C65558a(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfoObj");
        this.f188631d = multiTaskInfo;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f188631d.field_type;
    }

    public long getItemId() {
        return (long) (this.f188631d.field_id.hashCode() + this.f188631d.field_type);
    }
}
