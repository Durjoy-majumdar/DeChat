package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import e11.C97571a;
import e11.C97572b;
import f11.C97792a;
import f11.C97806o;
import g11.C98065a;
import java.util.HashSet;
import java.util.Set;
import jp3.C9487b;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.h */
public class C92989h implements C92993j.C92994a {

    /* renamed from: a */
    public final /* synthetic */ ChooseMsgFileUIController f267818a;

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.h$a */
    public class C92990a implements C97571a {

        /* renamed from: a */
        public final /* synthetic */ C97792a f267819a;

        /* renamed from: b */
        public final /* synthetic */ RecyclerView.C16631z f267820b;

        /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.h$a$a */
        public class C92991a implements Runnable {
            public C92991a() {
            }

            public void run() {
                C92989h.this.f267818a.f267780d.notifyDataSetChanged();
            }
        }

        public C92990a(C97792a aVar, RecyclerView.C16631z zVar) {
            this.f267819a = aVar;
            this.f267820b = zVar;
        }

        /* renamed from: a */
        public void mo127395a(int i, int i2) {
            Log.m105921e("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadProgress offset:%d totalLen:%d", this.f267819a, Integer.valueOf(i), Integer.valueOf(i2));
            C97792a aVar = this.f267819a;
            synchronized (aVar) {
                aVar.f286881e = 2;
                aVar.f286879c = i;
                aVar.f286880d = i2;
            }
            RecyclerView.C16631z zVar = this.f267820b;
            if (zVar != null) {
                C97792a aVar2 = (C97792a) ((C97806o) zVar).f286906A.getTag();
                if (aVar2.equals(this.f267819a)) {
                    aVar2.mo137128l(this.f267820b);
                }
            }
        }

        /* renamed from: b */
        public void mo127396b() {
            Log.m105921e("MicroMsg.ChooseMsgFileUIController", "item:%s onExpireFail", this.f267819a);
            ChooseMsgFileUIController.m117285a(C92989h.this.f267818a).mo137366f(this.f267819a.mo137122f());
            C97792a aVar = this.f267819a;
            synchronized (aVar) {
                aVar.f286881e = 4;
            }
            RecyclerView.C16631z zVar = this.f267820b;
            if (zVar != null) {
                C97792a aVar2 = (C97792a) ((C97806o) zVar).f286906A.getTag();
                if (aVar2.equals(this.f267819a)) {
                    aVar2.mo137128l(this.f267820b);
                }
            }
        }

        /* renamed from: c */
        public void mo127397c(MsgFile msgFile) {
            Log.m105925i("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadSuccess msgFile:%s", this.f267819a, msgFile);
            ChooseMsgFileUIController.m117285a(C92989h.this.f267818a).mo137366f(this.f267819a.mo137122f());
            C98065a a = ChooseMsgFileUIController.m117285a(C92989h.this.f267818a);
            long f = this.f267819a.mo137122f();
            C97792a aVar = this.f267819a;
            a.mo137364d(f, msgFile, aVar, C92989h.this.f267818a.f267780d.f267794e.indexOf(aVar));
            if (ChooseMsgFileUIController.m117285a(C92989h.this.f267818a).mo137363c()) {
                MMHandlerThread.postToMainThread(new C92991a());
            }
            C92989h.this.f267818a.f267798b.mo127408P1();
            C97792a aVar2 = this.f267819a;
            synchronized (aVar2) {
                aVar2.f286881e = 3;
            }
            RecyclerView.C16631z zVar = this.f267820b;
            if (zVar != null) {
                C97792a aVar3 = (C97792a) ((C97806o) zVar).f286906A.getTag();
                if (aVar3.equals(this.f267819a)) {
                    aVar3.mo137128l(this.f267820b);
                }
            }
        }

        /* renamed from: d */
        public void mo127398d() {
            Log.m105925i("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadPause", this.f267819a);
            ChooseMsgFileUIController.m117285a(C92989h.this.f267818a).mo137366f(this.f267819a.mo137122f());
            C97792a aVar = this.f267819a;
            synchronized (aVar) {
                aVar.f286881e = 0;
            }
            RecyclerView.C16631z zVar = this.f267820b;
            if (zVar != null) {
                C97792a aVar2 = (C97792a) ((C97806o) zVar).f286906A.getTag();
                if (aVar2.equals(this.f267819a)) {
                    aVar2.mo137128l(this.f267820b);
                }
            }
        }

        /* renamed from: e */
        public void mo127399e() {
            Log.m105921e("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadFails", this.f267819a);
            ChooseMsgFileUIController.m117285a(C92989h.this.f267818a).mo137366f(this.f267819a.mo137122f());
            C97792a aVar = this.f267819a;
            synchronized (aVar) {
                aVar.f286881e = 5;
            }
            RecyclerView.C16631z zVar = this.f267820b;
            if (zVar != null) {
                C97792a aVar2 = (C97792a) ((C97806o) zVar).f286906A.getTag();
                if (aVar2.equals(this.f267819a)) {
                    aVar2.mo137128l(this.f267820b);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.h$b */
    public class C92992b implements Runnable {
        public C92992b() {
        }

        public void run() {
            C92989h.this.f267818a.f267780d.notifyDataSetChanged();
        }
    }

    public C92989h(ChooseMsgFileUIController chooseMsgFileUIController) {
        this.f267818a = chooseMsgFileUIController;
    }

    /* renamed from: a */
    public void mo127394a(boolean z, C97792a aVar, RecyclerView.C16631z zVar) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.ChooseMsgFileUIController", "[onCheck] item is null, err");
            return;
        }
        Log.m105925i("MicroMsg.ChooseMsgFileUIController", "[onCheck] isChecked:%b", Boolean.valueOf(z));
        if (z) {
            synchronized (aVar) {
                aVar.f286881e = 1;
            }
            C98065a a = ChooseMsgFileUIController.m117285a(this.f267818a);
            long f = aVar.mo137122f();
            synchronized (a) {
                Set<Long> set = a.f287514d;
                if (set != null) {
                    ((HashSet) set).add(Long.valueOf(f));
                }
            }
            C92990a aVar2 = new C92990a(aVar, zVar);
            ChooseMsgFileUIController chooseMsgFileUIController = this.f267818a;
            C97572b.m125735a(aVar, aVar2, chooseMsgFileUIController.f267798b.getContext() instanceof C9487b ? (C9487b) chooseMsgFileUIController.f267798b.getContext() : null);
        } else {
            synchronized (aVar) {
                aVar.f286881e = 0;
            }
            ChooseMsgFileUIController.m117285a(this.f267818a).mo137366f(aVar.mo137122f());
            ChooseMsgFileUIController.m117285a(this.f267818a).mo137365e(aVar.mo137122f());
            if (ChooseMsgFileUIController.m117285a(this.f267818a).mo137363c()) {
                MMHandlerThread.postToMainThread(new C92992b());
            }
            this.f267818a.f267798b.mo127408P1();
        }
        if (zVar != null && ((C97792a) ((C97806o) zVar).f286906A.getTag()).equals(aVar)) {
            aVar.mo137128l(zVar);
        }
    }
}
