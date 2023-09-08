package com.tencent.p014mm.plugin.component.editor.widget.voiceview;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.widget.voiceview.C93093a;
import com.tencent.p014mm.plugin.fav.p047ui.C68924p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import nj3.C76912y0;
import ob0.C76996p;
import p182kk.C61104a;
import p206nj.C88955f;
import p371ph.C21967a;
import p910lj.C76701a;
import pb1.C100734q;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView */
public class VoiceView extends FrameLayout implements C93093a.C93094a, C111847h {

    /* renamed from: d */
    public ViewGroup f268187d;

    /* renamed from: e */
    public TextView f268188e;

    /* renamed from: f */
    public ImageButton f268189f;

    /* renamed from: g */
    public TextView f268190g;

    /* renamed from: h */
    public TextView f268191h;

    /* renamed from: i */
    public View f268192i;

    /* renamed from: j */
    public int f268193j;

    /* renamed from: n */
    public String f268194n = "";

    /* renamed from: o */
    public int f268195o;

    /* renamed from: p */
    public C93093a f268196p;

    /* renamed from: q */
    public C93092c f268197q;

    /* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView$a */
    public class C93090a implements Runnable {
        public C93090a() {
        }

        public void run() {
            VoiceView.this.f268197q.mo127594b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView$b */
    public class C93091b implements View.OnClickListener {
        public C93091b() {
        }

        public void onClick(View view) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C61104a.m71669y(view.getContext()) || C61104a.m71665u(view.getContext()) || C61104a.m71649e(view.getContext())) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C88955f.m111058b() || Util.isNullOrNil(VoiceView.this.f268194n)) {
                if (!Util.nullAs(VoiceView.this.f268194n, "").equals(VoiceView.this.f268196p.f268208e)) {
                    VoiceView.m117451e(VoiceView.this);
                } else if (VoiceView.this.f268196p.mo127596c()) {
                    VoiceView voiceView = VoiceView.this;
                    voiceView.getClass();
                    Log.m105924i("MicroMsg.NoteVoiceView", "pause play");
                    C93093a aVar = voiceView.f268196p;
                    aVar.getClass();
                    Log.m105924i("MicroMsg.RecordVoiceHelper", "pause play");
                    MMEntryLock.unlock("keep_app_silent");
                    C76996p pVar = aVar.f268207d;
                    if (pVar == null) {
                        Log.m105928w("MicroMsg.RecordVoiceHelper", "pause play error, player is null");
                    } else if (((C21967a) pVar).mo35059c(true)) {
                        for (C93093a.C93094a next : aVar.f268216p) {
                            if (next != null) {
                                next.mo127584c();
                            }
                        }
                    }
                    C93092c cVar = voiceView.f268197q;
                    cVar.f268200a = true;
                    cVar.removeMessages(4096);
                    VoiceView.this.f268189f.setImageResource(C0966R.raw.voicepost_beginicon);
                    VoiceView voiceView2 = VoiceView.this;
                    voiceView2.f268189f.setContentDescription(voiceView2.getContext().getResources().getString(C0966R.string.a1s));
                    voiceView.f268188e.setKeepScreenOn(false);
                } else {
                    VoiceView voiceView3 = VoiceView.this;
                    voiceView3.getClass();
                    Log.m105924i("MicroMsg.NoteVoiceView", "resume play");
                    C93093a aVar2 = voiceView3.f268196p;
                    aVar2.getClass();
                    Log.m105924i("MicroMsg.RecordVoiceHelper", "resume play");
                    MMEntryLock.lock("keep_app_silent");
                    C76996p pVar2 = aVar2.f268207d;
                    if (pVar2 == null) {
                        Log.m105928w("MicroMsg.RecordVoiceHelper", "resum play error, player is null");
                        z = false;
                    } else {
                        z = ((C21967a) pVar2).mo35060d();
                        if (z) {
                            for (C93093a.C93094a next2 : aVar2.f268216p) {
                                if (next2 != null) {
                                    next2.mo127582a(aVar2.f268208e);
                                }
                            }
                        }
                    }
                    C93092c cVar2 = voiceView3.f268197q;
                    cVar2.f268200a = false;
                    cVar2.sendEmptyMessage(4096);
                    VoiceView.this.f268189f.setImageResource(C0966R.raw.voicepost_pauseicon);
                    VoiceView voiceView4 = VoiceView.this;
                    voiceView4.f268189f.setContentDescription(voiceView4.getContext().getResources().getString(C0966R.string.a1a));
                    voiceView3.f268188e.setKeepScreenOn(true);
                    if (!z) {
                        VoiceView.m117451e(VoiceView.this);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C76912y0.m92771j(view.getContext(), (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView$c */
    public class C93092c extends MMHandler {

        /* renamed from: a */
        public boolean f268200a;

        /* renamed from: b */
        public float f268201b;

        /* renamed from: c */
        public float f268202c;

        /* renamed from: d */
        public int f268203d;

        /* renamed from: e */
        public int f268204e;

        public C93092c(C93090a aVar) {
        }

        /* renamed from: a */
        public void mo127593a(int i) {
            this.f268200a = false;
            float R = C100734q.m131827R((long) i);
            this.f268201b = R;
            this.f268202c = R;
            this.f268204e = C76577a.m92151b(VoiceView.this.getContext(), 0);
            VoiceView voiceView = VoiceView.this;
            voiceView.f268190g.setText(C68924p1.m81172a(voiceView.getContext(), (int) (this.f268201b - this.f268202c)));
            VoiceView voiceView2 = VoiceView.this;
            voiceView2.f268191h.setText(C68924p1.m81172a(voiceView2.getContext(), (int) this.f268201b));
            VoiceView.this.f268189f.setImageResource(C0966R.raw.voicepost_beginicon);
            VoiceView voiceView3 = VoiceView.this;
            voiceView3.f268189f.setContentDescription(voiceView3.getContext().getResources().getString(C0966R.string.a1s));
            VoiceView.this.f268188e.setWidth(this.f268204e);
        }

        /* renamed from: b */
        public void mo127594b() {
            float f = 1.0f - (this.f268202c / this.f268201b);
            int width = VoiceView.this.f268187d.getWidth();
            int i = this.f268204e;
            this.f268203d = ((int) (f * ((float) (width - i)))) + i;
            VoiceView voiceView = VoiceView.this;
            voiceView.f268190g.setText(C68924p1.m81172a(voiceView.getContext(), (int) (this.f268201b - this.f268202c)));
            VoiceView voiceView2 = VoiceView.this;
            voiceView2.f268191h.setText(C68924p1.m81172a(voiceView2.getContext(), (int) this.f268201b));
            VoiceView.this.f268188e.setWidth(this.f268203d);
        }

        /* renamed from: c */
        public void mo127595c(double d, int i, boolean z) {
            this.f268204e = C76577a.m92151b(VoiceView.this.getContext(), 0);
            VoiceView.this.f268189f.setImageResource(C0966R.raw.voicepost_beginicon);
            VoiceView voiceView = VoiceView.this;
            voiceView.f268189f.setContentDescription(voiceView.getContext().getResources().getString(C0966R.string.a1s));
            mo127594b();
            if (z) {
                VoiceView.this.f268189f.setImageResource(C0966R.raw.voicepost_pauseicon);
                VoiceView voiceView2 = VoiceView.this;
                voiceView2.f268189f.setContentDescription(voiceView2.getContext().getResources().getString(C0966R.string.a1a));
                sendEmptyMessage(4096);
            }
        }

        public void handleMessage(Message message) {
            this.f268202c = Math.max(0.0f, this.f268202c - 0.256f);
            mo127594b();
            if (this.f268202c > 0.1f) {
                sendEmptyMessageDelayed(4096, 256);
            }
        }
    }

    public VoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f359646a10, this, true);
    }

    /* renamed from: e */
    public static void m117451e(VoiceView voiceView) {
        Log.m105919d("MicroMsg.NoteVoiceView", "start play, path[%s] voiceType[%d]", voiceView.f268194n, Integer.valueOf(voiceView.f268195o));
        if (voiceView.f268196p.mo127597d(voiceView.f268194n, voiceView.f268195o)) {
            voiceView.f268188e.setKeepScreenOn(true);
            C93092c cVar = voiceView.f268197q;
            cVar.f268200a = false;
            cVar.removeMessages(4096);
            cVar.mo127593a(VoiceView.this.f268193j);
            cVar.f268200a = false;
            VoiceView.this.f268189f.setImageResource(C0966R.raw.voicepost_pauseicon);
            VoiceView voiceView2 = VoiceView.this;
            voiceView2.f268189f.setContentDescription(voiceView2.getContext().getResources().getString(C0966R.string.a1a));
            cVar.sendEmptyMessage(4096);
            return;
        }
        C76701a.makeText(voiceView.getContext(), (int) C0966R.string.csa, 1).show();
    }

    /* renamed from: a */
    public void mo127582a(String str) {
    }

    /* renamed from: b */
    public void mo127583b(String str) {
        if (!this.f268194n.equals(str)) {
            C93092c cVar = this.f268197q;
            cVar.f268200a = false;
            cVar.removeMessages(4096);
            cVar.mo127593a(VoiceView.this.f268193j);
            this.f268188e.setKeepScreenOn(false);
        }
    }

    /* renamed from: c */
    public void mo127584c() {
    }

    /* renamed from: d */
    public void mo127585d() {
        C93092c cVar = this.f268197q;
        cVar.f268200a = false;
        cVar.removeMessages(4096);
        cVar.mo127593a(VoiceView.this.f268193j);
        this.f268188e.setKeepScreenOn(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.m105925i("MicroMsg.NoteVoiceView", "on configuration changed, is paused ? %B", Boolean.valueOf(this.f268197q.f268200a));
        C93092c cVar = this.f268197q;
        if (cVar.f268200a) {
            cVar.postDelayed(new C93090a(), 128);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f268187d = (ViewGroup) findViewById(C0966R.C0970id.lav);
        this.f268190g = (TextView) findViewById(C0966R.C0970id.lat);
        this.f268191h = (TextView) findViewById(C0966R.C0970id.lax);
        this.f268188e = (TextView) findViewById(C0966R.C0970id.lau);
        this.f268189f = (ImageButton) findViewById(C0966R.C0970id.las);
        this.f268192i = findViewById(C0966R.C0970id.lbz);
        this.f268197q = new C93092c((C93090a) null);
        this.f268189f.setOnClickListener(new C93091b());
    }

    public void setVoiceHelper(C93093a aVar) {
        this.f268196p = aVar;
        for (C93093a.C93094a aVar2 : aVar.f268216p) {
            if (this == aVar2) {
                return;
            }
        }
        ((LinkedList) aVar.f268216p).add(this);
    }

    public VoiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f359646a10, this, true);
    }
}
