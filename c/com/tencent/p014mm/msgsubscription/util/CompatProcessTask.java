package com.tencent.p014mm.msgsubscription.util;

import android.os.Parcelable;
import android.os.Process;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/util/CompatProcessTask;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.util.CompatProcessTask */
public abstract class CompatProcessTask implements Parcelable {

    /* renamed from: d */
    public final C13601g f195834d = C36568h.m40985a(new C68151b(this));

    /* renamed from: com.tencent.mm.msgsubscription.util.CompatProcessTask$a */
    public static final class C68150a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CompatProcessTask f195835d;

        public C68150a(CompatProcessTask compatProcessTask) {
            this.f195835d = compatProcessTask;
        }

        public final void run() {
            this.f195835d.mo93656d();
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.util.CompatProcessTask$b */
    public static final class C68151b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ CompatProcessTask f195836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68151b(CompatProcessTask compatProcessTask) {
            super(0);
            this.f195836d = compatProcessTask;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(Process.myPid());
            sb.append('_');
            sb.append(this.f195836d.hashCode());
            return sb.toString();
        }
    }

    /* renamed from: b */
    public final void mo93654b() {
        C119179t tVar = C119157j.f356862d;
        C68150a aVar = new C68150a(this);
        ((C119157j) tVar).mo183876g(aVar, "CompatProcessTask_" + ((String) ((C36570n) this.f195834d).getValue()));
    }

    /* renamed from: c */
    public void mo93655c() {
    }

    /* renamed from: d */
    public abstract void mo93656d();

    public int describeContents() {
        return 0;
    }
}
