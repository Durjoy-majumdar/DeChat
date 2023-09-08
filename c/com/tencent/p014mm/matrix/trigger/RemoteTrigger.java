package com.tencent.p014mm.matrix.trigger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import t70.C36961c;
import t70.C36963e;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/matrix/trigger/RemoteTrigger;", "Landroid/content/BroadcastReceiver;", "Lt70/c;", "<init>", "()V", "plugin-performance_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.matrix.trigger.RemoteTrigger */
public final class RemoteTrigger extends BroadcastReceiver implements C36961c {

    /* renamed from: d */
    public static final RemoteTrigger f79440d = new RemoteTrigger();

    /* renamed from: com.tencent.mm.matrix.trigger.RemoteTrigger$a */
    public static final class C28966a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f79441d;

        /* renamed from: e */
        public final /* synthetic */ int f79442e;

        public C28966a(boolean z, int i) {
            this.f79441d = z;
            this.f79442e = i;
        }

        public final void run() {
            boolean z = this.f79441d;
            int i = this.f79442e;
            C36961c cVar = C36963e.f98036a;
            if (cVar != null) {
                C36961c.C36962a.m41108a(cVar, z, i, (C32226l) null, 4, (Object) null);
            }
            C36961c cVar2 = C36963e.f98037b;
            if (cVar2 != null) {
                C36961c.C36962a.m41108a(cVar2, z, i, (C32226l) null, 4, (Object) null);
            }
            C36961c cVar3 = C36963e.f98038c;
            if (cVar3 != null) {
                C36961c.C36962a.m41108a(cVar3, z, i, (C32226l) null, 4, (Object) null);
            }
            C36961c cVar4 = C36963e.f98039d;
            if (cVar4 != null) {
                C36961c.C36962a.m41108a(cVar4, z, i, (C32226l) null, 4, (Object) null);
            }
            C36961c cVar5 = C36963e.f98040e;
            if (cVar5 != null) {
                C36961c.C36962a.m41108a(cVar5, z, i, (C32226l) null, 4, (Object) null);
            }
        }
    }

    private RemoteTrigger() {
    }

    /* renamed from: a */
    public boolean mo56355a(boolean z, int i, C32226l<Object, C13598b0> lVar) {
        Intent intent = new Intent("com.tencent.mm.RemoteTrigger");
        intent.putExtra("KEY_FORCE_PULL", z);
        intent.putExtra("KEY_PULL_TYPE", i);
        MMApplicationContext.getContext().sendBroadcast(intent);
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && C87412m.m108589b("com.tencent.mm.RemoteTrigger", intent.getAction())) {
            boolean booleanExtra = intent.getBooleanExtra("KEY_FORCE_PULL", false);
            int intExtra = intent.getIntExtra("KEY_PULL_TYPE", -2);
            ((C119157j) C119157j.f356862d).mo183884o(new C28966a(booleanExtra, intExtra));
        }
    }
}
