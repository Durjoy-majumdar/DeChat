package ib3;

import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72972g4;
import db3.C97478u;
import de3.C45331f0;
import de3.C75370s;
import eb0.C97625j3;
import f40.C86709a0;
import kb0.C76528a;
import p629ny.C76976e;
import xa3.C102587c;
import xa3.C102593i;

/* renamed from: ib3.q */
public class C98651q extends C98628a {

    /* renamed from: B */
    public WXRTEditText f289256B;

    /* renamed from: ib3.q$a */
    public class C98652a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: ib3.q$a$a */
        public class C98653a implements Runnable {
            public C98653a() {
            }

            public void run() {
                C98651q.this.f289256B.hasFocus();
            }
        }

        public C98652a() {
        }

        public void onGlobalLayout() {
            C86709a0.m107525e().postToWorker(new C98653a());
        }
    }

    /* renamed from: ib3.q$b */
    public class C98654b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102593i f289259d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f289260e;

        /* renamed from: ib3.q$b$a */
        public class C98655a implements Runnable {
            public C98655a() {
            }

            public void run() {
                C98654b bVar = C98654b.this;
                if (bVar.f289259d.f302080k != 0) {
                    int i = C98651q.this.f289256B.getSelection().f263989d;
                    if (i == C98654b.this.f289259d.f302126s.length()) {
                        C98651q.this.f289256B.mo134891v();
                        C98651q.this.f289256B.getText().append("\n");
                        C98651q.this.f289256B.mo134854B();
                        C98651q.this.f289256B.setSelection(i);
                    }
                    C98654b bVar2 = C98654b.this;
                    C102593i iVar = bVar2.f289259d;
                    iVar.f302080k = 0;
                    int i2 = iVar.f302081l;
                    if (i2 == 1) {
                        C98651q.this.f289256B.mo134878s(C97478u.f286110c, Boolean.TRUE);
                    } else if (i2 == 3) {
                        C98651q.this.f289256B.mo134878s(C97478u.f286109b, Boolean.TRUE);
                    } else if (i2 == 2) {
                        C98651q.this.f289256B.mo134878s(C97478u.f286111d, Boolean.TRUE);
                    }
                }
            }
        }

        public C98654b(C102593i iVar, Bundle bundle) {
            this.f289259d = iVar;
            this.f289260e = bundle;
        }

        public void run() {
            C98651q.this.f289256B.setRichTextEditing(this.f289259d.f302126s);
            C98651q.this.f289256B.mo134891v();
            WXRTEditText wXRTEditText = C98651q.this.f289256B;
            synchronized (wXRTEditText) {
                wXRTEditText.f283174w = true;
            }
            C98651q qVar = C98651q.this;
            WXRTEditText wXRTEditText2 = qVar.f289256B;
            Bundle bundle = this.f289260e;
            C76976e eVar = C75370s.f221608c;
            int i = qVar.f289192z.f283197m;
            C75370s.m90386l(wXRTEditText2, bundle, eVar, i == 2 ? 9 : i == 1 ? 8 : 0);
            WXRTEditText wXRTEditText3 = C98651q.this.f289256B;
            synchronized (wXRTEditText3) {
                wXRTEditText3.f283174w = false;
            }
            C98651q.this.f289256B.mo134854B();
            C102593i iVar = this.f289259d;
            if (iVar.f302071b) {
                int i2 = iVar.f302072c;
                if (i2 == -1 || i2 >= C98651q.this.f289256B.getText().toString().length()) {
                    WXRTEditText wXRTEditText4 = C98651q.this.f289256B;
                    wXRTEditText4.setSelection(wXRTEditText4.getText().toString().length());
                } else {
                    C98651q.this.f289256B.setSelection(this.f289259d.f302072c);
                }
                C98651q.this.f289256B.requestFocus();
                MMHandlerThread.postToMainThreadDelayed(new C98655a(), 500);
            } else if (C98651q.this.f289256B.hasFocus()) {
                C98651q.this.f289256B.clearFocus();
            }
            C102593i iVar2 = this.f289259d;
            if (iVar2.f302079j) {
                iVar2.f302079j = false;
                WXRTEditText wXRTEditText5 = C98651q.this.f289256B;
                wXRTEditText5.f283149E = true;
                wXRTEditText5.onTextContextMenuItem(16908322);
            }
        }
    }

    public C98651q(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        WXRTEditText wXRTEditText = (WXRTEditText) view.findViewById(C0966R.C0970id.ix5);
        this.f289256B = wXRTEditText;
        if (bVar.f283197m != 2 || !this.f289192z.f283198n) {
            wXRTEditText.setKeyListener((KeyListener) null);
            this.f289256B.setFocusable(false);
            this.f289256B.setClickable(true);
        }
        WXRTEditText wXRTEditText2 = this.f289256B;
        wXRTEditText2.f283150F = this;
        wXRTEditText2.setEditTextType(0);
        this.f289192z.mo134911i(this.f289256B);
        this.f289256B.getViewTreeObserver().addOnGlobalLayoutListener(new C98652a());
    }

    /* renamed from: y */
    public int mo138058y() {
        return 1;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        this.f289256B.setPosInDataList(i);
        C102593i iVar = (C102593i) cVar;
        iVar.f302075f = this.f289256B;
        Bundle bundle = null;
        iVar.f302073d = null;
        iVar.f302074e = null;
        C102587c k = this.f289191A.mo126201k(i - 1);
        int i3 = 0;
        if (k != null && k.mo142212c() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f289256B.getLayoutParams();
            layoutParams.topMargin = 0;
            this.f289256B.setLayoutParams(layoutParams);
        }
        C102587c k2 = this.f289191A.mo126201k(i + 1);
        if (k2 != null && k2.mo142212c() == 1) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f289256B.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            this.f289256B.setLayoutParams(layoutParams2);
        }
        int i4 = this.f289192z.f283197m;
        int i5 = -1;
        if (i4 == 1) {
            String t = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f289192z.f283186b).mo108768t();
            if (this.f289192z.f283185a) {
                C45331f0.C45333b bVar = C45331f0.C45333b.NOTE_FROM_GROUP_CHAT;
                if (t != null) {
                    i5 = C76528a.m92004a(t);
                }
                bundle = bVar.mo70879a(i5);
            } else {
                C45331f0.C45333b bVar2 = C45331f0.C45333b.NOTE_FROM_SINGLE_CHAT;
                if (t != null) {
                    i5 = C76528a.m92004a(t);
                }
                bundle = bVar2.mo70879a(i5);
            }
        } else if (i4 == 2) {
            bundle = C45331f0.C45333b.NOTE_FROM_FAV.mo70879a(-1);
        } else if (i4 == 4) {
            bundle = C45331f0.C45333b.NOTE_FROM_TIMELINE.mo70879a(-1);
        }
        C96679b bVar3 = this.f289192z;
        if (bVar3.f283197m != 2 || !bVar3.f283198n) {
            this.f289256B.setRichTextEditing(iVar.f302126s);
            WXRTEditText wXRTEditText = this.f289256B;
            C76976e eVar = C75370s.f221608c;
            int i6 = this.f289192z.f283197m;
            if (i6 == 2) {
                i3 = 9;
            } else if (i6 == 1) {
                i3 = 8;
            }
            C75370s.m90386l(wXRTEditText, bundle, eVar, i3);
        } else {
            MMHandlerThread.postToMainThread(new C98654b(iVar, bundle));
        }
        Log.m105924i("MicroMsg.Note.NoteTextItemHolder", "TextItemHolder position is " + mo17364k());
    }
}
