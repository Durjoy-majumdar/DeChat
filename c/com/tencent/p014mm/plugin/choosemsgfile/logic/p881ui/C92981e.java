package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import e11.C97571a;
import e11.C97572b;
import f11.C97792a;
import f11.C97809p;
import g11.C98065a;
import java.util.HashSet;
import java.util.Set;
import jp3.C9487b;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.e */
public class C92981e implements C92993j.C92994a {

    /* renamed from: a */
    public final /* synthetic */ C92985f f267801a;

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.e$a */
    public class C92982a implements C97571a {

        /* renamed from: a */
        public final /* synthetic */ C97792a f267802a;

        /* renamed from: b */
        public final /* synthetic */ RecyclerView.C16631z f267803b;

        /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.e$a$a */
        public class C92983a implements Runnable {
            public C92983a() {
            }

            public void run() {
                C92981e.this.f267801a.f267807d.notifyDataSetChanged();
            }
        }

        public C92982a(C97792a aVar, RecyclerView.C16631z zVar) {
            this.f267802a = aVar;
            this.f267803b = zVar;
        }

        /* renamed from: a */
        public void mo127395a(int i, int i2) {
            Log.m105921e("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadProgress offset:%d totalLen:%d", this.f267802a, Integer.valueOf(i), Integer.valueOf(i2));
            C97792a aVar = this.f267802a;
            synchronized (aVar) {
                aVar.f286881e = 2;
                aVar.f286879c = i;
                aVar.f286880d = i2;
            }
            RecyclerView.C16631z zVar = this.f267803b;
            if (zVar != null) {
                C97792a aVar2 = (C97792a) ((C97809p) zVar).f286932z.getTag();
                if (aVar2.equals(this.f267802a)) {
                    aVar2.mo137128l(this.f267803b);
                }
            }
        }

        /* renamed from: b */
        public void mo127396b() {
            Log.m105921e("MicroMsg.ChooseMsgFileListUIController", "item:%s onExpireFail", this.f267802a);
            C92985f.m117298a(C92981e.this.f267801a).mo137366f(this.f267802a.mo137122f());
            C97792a aVar = this.f267802a;
            synchronized (aVar) {
                aVar.f286881e = 4;
            }
            RecyclerView.C16631z zVar = this.f267803b;
            if (zVar != null) {
                C97792a aVar2 = (C97792a) ((C97809p) zVar).f286932z.getTag();
                if (aVar2.equals(this.f267802a)) {
                    aVar2.mo137128l(this.f267803b);
                }
            }
        }

        /* renamed from: c */
        public void mo127397c(MsgFile msgFile) {
            Log.m105925i("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadSuccess msgFile:%s", this.f267802a, msgFile);
            C92985f.m117298a(C92981e.this.f267801a).mo137366f(this.f267802a.mo137122f());
            C98065a a = C92985f.m117298a(C92981e.this.f267801a);
            long f = this.f267802a.mo137122f();
            C97792a aVar = this.f267802a;
            a.mo137364d(f, msgFile, aVar, C92981e.this.f267801a.f267807d.f267794e.indexOf(aVar));
            if (C92985f.m117298a(C92981e.this.f267801a).mo137363c()) {
                MMHandlerThread.postToMainThread(new C92983a());
            }
            C92981e.this.f267801a.f267798b.mo127408P1();
            C97792a aVar2 = this.f267802a;
            synchronized (aVar2) {
                aVar2.f286881e = 3;
            }
            RecyclerView.C16631z zVar = this.f267803b;
            if (zVar != null) {
                C97792a aVar3 = (C97792a) ((C97809p) zVar).f286932z.getTag();
                if (aVar3.equals(this.f267802a)) {
                    aVar3.mo137128l(this.f267803b);
                }
            }
        }

        /* renamed from: d */
        public void mo127398d() {
            Log.m105925i("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadPause", this.f267802a);
            C92985f.m117298a(C92981e.this.f267801a).mo137366f(this.f267802a.mo137122f());
            C97792a aVar = this.f267802a;
            synchronized (aVar) {
                aVar.f286881e = 0;
            }
            RecyclerView.C16631z zVar = this.f267803b;
            if (zVar != null) {
                C97792a aVar2 = (C97792a) ((C97809p) zVar).f286932z.getTag();
                if (aVar2.equals(this.f267802a)) {
                    aVar2.mo137128l(this.f267803b);
                }
            }
        }

        /* renamed from: e */
        public void mo127399e() {
            Log.m105921e("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadFails", this.f267802a);
            C92985f.m117298a(C92981e.this.f267801a).mo137366f(this.f267802a.mo137122f());
            C97792a aVar = this.f267802a;
            synchronized (aVar) {
                aVar.f286881e = 5;
            }
            RecyclerView.C16631z zVar = this.f267803b;
            if (zVar != null) {
                C97792a aVar2 = (C97792a) ((C97809p) zVar).f286932z.getTag();
                if (aVar2.equals(this.f267802a)) {
                    aVar2.mo137128l(this.f267803b);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.e$b */
    public class C92984b implements Runnable {
        public C92984b() {
        }

        public void run() {
            C92981e.this.f267801a.f267807d.notifyDataSetChanged();
        }
    }

    public C92981e(C92985f fVar) {
        this.f267801a = fVar;
    }

    /* renamed from: a */
    public void mo127394a(boolean z, C97792a aVar, RecyclerView.C16631z zVar) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.ChooseMsgFileListUIController", "[onCheck] item is null, err");
            return;
        }
        Log.m105925i("MicroMsg.ChooseMsgFileListUIController", "[onCheck] isChecked :%b", Boolean.valueOf(z));
        if (z) {
            synchronized (aVar) {
                aVar.f286881e = 1;
            }
            C98065a a = C92985f.m117298a(this.f267801a);
            long f = aVar.mo137122f();
            synchronized (a) {
                Set<Long> set = a.f287514d;
                if (set != null) {
                    ((HashSet) set).add(Long.valueOf(f));
                }
            }
            C92982a aVar2 = new C92982a(aVar, zVar);
            C92985f fVar = this.f267801a;
            C97572b.m125735a(aVar, aVar2, fVar.f267798b.getContext() instanceof C9487b ? (C9487b) fVar.f267798b.getContext() : null);
        } else {
            synchronized (aVar) {
                aVar.f286881e = 0;
            }
            C92985f.m117298a(this.f267801a).mo137366f(aVar.mo137122f());
            C92985f.m117298a(this.f267801a).mo137365e(aVar.mo137122f());
            if (C92985f.m117298a(this.f267801a).mo137363c()) {
                MMHandlerThread.postToMainThread(new C92984b());
            }
            this.f267801a.f267798b.mo127408P1();
        }
        if (zVar != null) {
            aVar.mo137128l(zVar);
        }
    }
}
