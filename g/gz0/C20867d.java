package gz0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import hz0.C46140b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: gz0.d */
public class C20867d implements C11385n {

    /* renamed from: d */
    public List<WeakReference<C20870c>> f58956d = new ArrayList();

    /* renamed from: e */
    public String f58957e = "";

    /* renamed from: f */
    public LinkedList<String> f58958f = new LinkedList<>();

    /* renamed from: g */
    public int f58959g;

    /* renamed from: h */
    public int f58960h;

    /* renamed from: i */
    public int f58961i;

    /* renamed from: j */
    public int f58962j;

    /* renamed from: n */
    public int f58963n = 60;

    /* renamed from: o */
    public boolean f58964o = false;

    /* renamed from: p */
    public MTimerHandler f58965p = new MTimerHandler(new C20868a(), false);

    /* renamed from: q */
    public MTimerHandler f58966q = new MTimerHandler(new C20869b(), false);

    /* renamed from: gz0.d$a */
    public class C20868a implements MTimerHandler.CallBack {
        public C20868a() {
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.CardCodeMgr", "onTimerExpired, do request code");
            C20867d dVar = C20867d.this;
            dVar.mo32569a(dVar.f58957e);
            C20867d.this.mo32573e();
            return true;
        }
    }

    /* renamed from: gz0.d$b */
    public class C20869b implements MTimerHandler.CallBack {
        public C20869b() {
        }

        public boolean onTimerExpired() {
            C20870c cVar;
            Log.m105924i("MicroMsg.CardCodeMgr", "onTimerExpired, do refresh code one minute");
            C20867d dVar = C20867d.this;
            dVar.getClass();
            Log.m105924i("MicroMsg.CardCodeMgr", "onCodeChange()");
            if (dVar.f58956d != null) {
                for (int i = 0; i < ((ArrayList) dVar.f58956d).size(); i++) {
                    WeakReference weakReference = (WeakReference) ((ArrayList) dVar.f58956d).get(i);
                    if (!(weakReference == null || (cVar = (C20870c) weakReference.get()) == null)) {
                        cVar.mo23305C();
                    }
                }
            }
            C20867d.this.mo32572d();
            return true;
        }
    }

    /* renamed from: gz0.d$c */
    public interface C20870c {
        /* renamed from: C */
        void mo23305C();

        void onSuccess();

        /* renamed from: z */
        void mo23312z(int i, String str);
    }

    /* renamed from: a */
    public void mo32569a(String str) {
        if (this.f58964o) {
            Log.m105920e("MicroMsg.CardCodeMgr", "doGetCardCodes(), is doing get codes");
        } else if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardCodeMgr", "doGetCardCodes(), mCardId is empty!");
        } else {
            Log.m105924i("MicroMsg.CardCodeMgr", "doGetCardCodes() do get codes, card id " + str);
            this.f58964o = true;
            this.f58957e = str;
            C86709a0.m107529k().f251779b.mo123460f(new C46140b0(str));
        }
    }

    /* renamed from: b */
    public String mo32570b() {
        LinkedList<String> linkedList = this.f58958f;
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
            return "";
        } else if (this.f58959g >= this.f58958f.size()) {
            Log.m105920e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
            mo32569a(this.f58957e);
            return "";
        } else {
            if (this.f58961i >= this.f58958f.size() - this.f58959g) {
                Log.m105924i("MicroMsg.CardCodeMgr", "do request code, because the request_count >= than (codes.size() - show_count)");
                mo32569a(this.f58957e);
            }
            Log.m105924i("MicroMsg.CardCodeMgr", "getCode, show_count:" + this.f58959g + " request_count:" + this.f58961i + " codes size:" + this.f58958f.size());
            LinkedList<String> linkedList2 = this.f58958f;
            int i = this.f58959g;
            this.f58959g = i + 1;
            return linkedList2.get(i);
        }
    }

    /* renamed from: c */
    public boolean mo32571c() {
        LinkedList<String> linkedList = this.f58958f;
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
            return true;
        } else if (this.f58959g < this.f58958f.size()) {
            return false;
        } else {
            Log.m105920e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
            return true;
        }
    }

    /* renamed from: d */
    public void mo32572d() {
        mo32574f();
        Log.m105924i("MicroMsg.CardCodeMgr", "startRefreshCodeTimer() refresh_interval:" + this.f58962j);
        int i = this.f58962j;
        if (i > 0) {
            this.f58966q.startTimer((long) (i * 1000));
            Log.m105924i("MicroMsg.CardCodeMgr", "start refresh code timer!");
            return;
        }
        this.f58966q.startTimer((long) (this.f58963n * 1000));
        Log.m105920e("MicroMsg.CardCodeMgr", "not to start refresh code timer!");
    }

    /* renamed from: e */
    public void mo32573e() {
        Log.m105924i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
        if (!this.f58965p.stopped()) {
            this.f58965p.stopTimer();
        }
        Log.m105924i("MicroMsg.CardCodeMgr", "startRequestCodeTimer() request_time:" + this.f58960h);
        if (this.f58960h <= 0 || TextUtils.isEmpty(this.f58957e)) {
            Log.m105920e("MicroMsg.CardCodeMgr", "not to start request code timer!");
            return;
        }
        this.f58965p.startTimer((long) (this.f58960h * 1000));
        Log.m105924i("MicroMsg.CardCodeMgr", "start request code timer!");
    }

    /* renamed from: f */
    public void mo32574f() {
        Log.m105924i("MicroMsg.CardCodeMgr", "stopRefreshCodeTimer()!");
        if (!this.f58966q.stopped()) {
            this.f58966q.stopTimer();
        }
    }

    /* renamed from: g */
    public void mo32575g(C20870c cVar) {
        C20870c cVar2;
        if (this.f58956d != null && cVar != null) {
            int i = 0;
            while (i < this.f58956d.size()) {
                WeakReference weakReference = this.f58956d.get(i);
                if (weakReference == null || (cVar2 = (C20870c) weakReference.get()) == null || !cVar2.equals(cVar)) {
                    i++;
                } else {
                    this.f58956d.remove(weakReference);
                    return;
                }
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C20870c cVar;
        C20870c cVar2;
        Log.m105924i("MicroMsg.CardCodeMgr", "onSceneEnd, errType = " + i + " errCode = " + i2);
        int i3 = 0;
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C46140b0) {
                this.f58964o = false;
                Log.m105920e("MicroMsg.CardCodeMgr", "get codes success for card id " + this.f58957e);
                C46140b0 b0Var = (C46140b0) yVar;
                this.f58960h = b0Var.f124340g;
                this.f58961i = b0Var.f124341h;
                this.f58962j = b0Var.f124342i;
                if (b0Var.f124339f != null) {
                    this.f58958f.clear();
                    this.f58958f.addAll(b0Var.f124339f);
                    this.f58959g = 0;
                }
                Log.m105924i("MicroMsg.CardCodeMgr", "onSuccess()");
                if (this.f58956d != null) {
                    while (i3 < ((ArrayList) this.f58956d).size()) {
                        WeakReference weakReference = (WeakReference) ((ArrayList) this.f58956d).get(i3);
                        if (!(weakReference == null || (cVar2 = (C20870c) weakReference.get()) == null)) {
                            cVar2.onSuccess();
                        }
                        i3++;
                    }
                }
                mo32573e();
                if (this.f58962j != 0) {
                    mo32572d();
                }
            }
        } else if (yVar instanceof C46140b0) {
            this.f58964o = false;
            Log.m105920e("MicroMsg.CardCodeMgr", "get codes failed  for card id " + this.f58957e);
            Log.m105924i("MicroMsg.CardCodeMgr", "onFail()");
            if (this.f58956d != null) {
                while (i3 < ((ArrayList) this.f58956d).size()) {
                    WeakReference weakReference2 = (WeakReference) ((ArrayList) this.f58956d).get(i3);
                    if (!(weakReference2 == null || (cVar = (C20870c) weakReference2.get()) == null)) {
                        cVar.mo23312z(i2, str);
                    }
                    i3++;
                }
            }
        }
    }
}
