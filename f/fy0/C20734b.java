package fy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C45834o;
import s90.C77630j;

/* renamed from: fy0.b */
public class C20734b {

    /* renamed from: a */
    public static int f58616a = C45834o.f123751a.mo71302c();

    /* renamed from: b */
    public static long f58617b = 43200000;

    /* renamed from: c */
    public static long f58618c = 0;

    /* renamed from: d */
    public static boolean f58619d = false;

    /* renamed from: a */
    public static boolean m22688a(C19623o0 o0Var, C77630j jVar, int i) {
        C72996z1 z1Var;
        int i2;
        if (o0Var == null) {
            return false;
        }
        o0Var.f55518c1 = C29763t.m38871b(o0Var.field_talker);
        if (jVar != null && ((i2 = jVar.f226333o) == 5 || i2 == 7 || i2 == 10 || i2 == 8)) {
            return true;
        }
        if (o0Var.mo25763m2(1)) {
            Log.m105919d("MicroMsg.BizTimeLineConfigUtil", "biz flag %d return true, bizClientMsgId:%s", Integer.valueOf(o0Var.field_bitFlag), o0Var.field_bizClientMsgId);
            return true;
        }
        long j = f58618c;
        if (((((long) 2) & j) != 0) && o0Var.f55518c1) {
            return true;
        }
        return (((j & ((long) 1)) > 0 ? 1 : ((j & ((long) 1)) == 0 ? 0 : -1)) != 0) && (z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(o0Var.field_talker)) != null && z1Var.mo62940x3();
    }
}
