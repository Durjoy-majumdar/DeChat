package com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview;

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
import com.tencent.p014mm.plugin.fav.p047ui.C68924p1;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview.C96750a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nj3.C76912y0;
import p182kk.C61104a;
import p206nj.C88955f;
import p371ph.C21967a;
import p910lj.C76701a;
import pb1.C100734q;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView */
public class NoteVoiceView extends FrameLayout implements C96750a.C96751a, C111847h {

    /* renamed from: d */
    public ViewGroup f283402d;

    /* renamed from: e */
    public TextView f283403e;

    /* renamed from: f */
    public ImageButton f283404f;

    /* renamed from: g */
    public TextView f283405g;

    /* renamed from: h */
    public TextView f283406h;

    /* renamed from: i */
    public View f283407i;

    /* renamed from: j */
    public int f283408j;

    /* renamed from: n */
    public String f283409n = "";

    /* renamed from: o */
    public int f283410o;

    /* renamed from: p */
    public C96750a f283411p;

    /* renamed from: q */
    public C96749c f283412q;

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView$a */
    public class C96747a implements Runnable {
        public C96747a() {
        }

        public void run() {
            NoteVoiceView.this.f283412q.mo135017b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView$b */
    public class C96748b implements View.OnClickListener {
        public C96748b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C61104a.m71669y(view.getContext()) || C61104a.m71665u(view.getContext()) || C61104a.m71649e(view.getContext())) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C88955f.m111058b() || Util.isNullOrNil(NoteVoiceView.this.f283409n)) {
                if (!Util.nullAs(NoteVoiceView.this.f283409n, "").equals(NoteVoiceView.this.f283411p.f283421d)) {
                    NoteVoiceView.m124185e(NoteVoiceView.this);
                } else if (NoteVoiceView.this.f283411p.mo135022e()) {
                    NoteVoiceView noteVoiceView = NoteVoiceView.this;
                    noteVoiceView.getClass();
                    Log.m105924i("MicroMsg.NoteVoiceView", "pause play");
                    C96750a aVar = noteVoiceView.f283411p;
                    aVar.getClass();
                    Log.m105924i("MicroMsg.NoteEditorVoiceHelper", "pause play");
                    MMEntryLock.unlock("keep_app_silent");
                    if (((C21967a) aVar.mo135021d()).mo35059c(true)) {
                        for (C96750a.C96751a next : aVar.f283429o) {
                            if (next != null) {
                                next.mo135006c();
                            }
                        }
                    }
                    C96749c cVar = noteVoiceView.f283412q;
                    cVar.f283415a = true;
                    cVar.removeMessages(4096);
                    NoteVoiceView.this.f283404f.setImageResource(C0966R.raw.voicepost_beginicon);
                    ImageButton imageButton = NoteVoiceView.this.f283404f;
                    imageButton.setContentDescription(NoteVoiceView.this.getContext().getResources().getString(C0966R.string.a1s) + NoteVoiceView.this.getContext().getResources().getString(C0966R.string.h_9));
                    noteVoiceView.f283403e.setKeepScreenOn(false);
                } else {
                    NoteVoiceView noteVoiceView2 = NoteVoiceView.this;
                    noteVoiceView2.getClass();
                    Log.m105924i("MicroMsg.NoteVoiceView", "resume play");
                    C96750a aVar2 = noteVoiceView2.f283411p;
                    aVar2.getClass();
                    Log.m105924i("MicroMsg.NoteEditorVoiceHelper", "resume play");
                    MMEntryLock.lock("keep_app_silent");
                    boolean d = ((C21967a) aVar2.mo135021d()).mo35060d();
                    if (d) {
                        for (C96750a.C96751a next2 : aVar2.f283429o) {
                            if (next2 != null) {
                                next2.mo135004a(aVar2.f283421d);
                            }
                        }
                    }
                    C96749c cVar2 = noteVoiceView2.f283412q;
                    cVar2.f283415a = false;
                    cVar2.sendEmptyMessage(4096);
                    NoteVoiceView.this.f283404f.setImageResource(C0966R.raw.voicepost_pauseicon);
                    NoteVoiceView noteVoiceView3 = NoteVoiceView.this;
                    noteVoiceView3.f283404f.setContentDescription(noteVoiceView3.getContext().getResources().getString(C0966R.string.a1a));
                    noteVoiceView2.f283403e.setKeepScreenOn(true);
                    if (!d) {
                        NoteVoiceView.m124185e(NoteVoiceView.this);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C76912y0.m92771j(view.getContext(), (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView$c */
    public class C96749c extends MMHandler {

        /* renamed from: a */
        public boolean f283415a;

        /* renamed from: b */
        public float f283416b;

        /* renamed from: c */
        public float f283417c;

        /* renamed from: d */
        public int f283418d;

        /* renamed from: e */
        public int f283419e;

        public C96749c(C96747a aVar) {
        }

        /* renamed from: a */
        public void mo135016a(int i) {
            this.f283415a = false;
            float R = C100734q.m131827R((long) i);
            this.f283416b = R;
            this.f283417c = R;
            this.f283419e = C76577a.m92151b(NoteVoiceView.this.getContext(), 0);
            NoteVoiceView noteVoiceView = NoteVoiceView.this;
            noteVoiceView.f283405g.setText(C68924p1.m81172a(noteVoiceView.getContext(), (int) (this.f283416b - this.f283417c)));
            NoteVoiceView noteVoiceView2 = NoteVoiceView.this;
            noteVoiceView2.f283406h.setText(C68924p1.m81172a(noteVoiceView2.getContext(), (int) this.f283416b));
            float f = this.f283416b;
            TextView textView = NoteVoiceView.this.f283406h;
            Context context = textView.getContext();
            textView.setTag(C0966R.C0970id.f359346ke3, context.getString(C0966R.string.f361500kd2, new Object[]{"" + (((int) f) / 60), "" + (((int) f) % 60)}));
            NoteVoiceView.this.f283404f.setImageResource(C0966R.raw.voicepost_beginicon);
            ImageButton imageButton = NoteVoiceView.this.f283404f;
            StringBuilder sb = new StringBuilder();
            sb.append(NoteVoiceView.this.getContext().getResources().getString(C0966R.string.a1s));
            sb.append(NoteVoiceView.this.getContext().getResources().getString(C0966R.string.h_9));
            imageButton.setContentDescription(sb.toString());
            NoteVoiceView.this.f283403e.setWidth(this.f283419e);
        }

        /* renamed from: b */
        public void mo135017b() {
            float f = 1.0f - (this.f283417c / this.f283416b);
            int width = NoteVoiceView.this.f283402d.getWidth();
            int i = this.f283419e;
            this.f283418d = ((int) (f * ((float) (width - i)))) + i;
            NoteVoiceView noteVoiceView = NoteVoiceView.this;
            noteVoiceView.f283405g.setText(C68924p1.m81172a(noteVoiceView.getContext(), (int) (this.f283416b - this.f283417c)));
            NoteVoiceView noteVoiceView2 = NoteVoiceView.this;
            noteVoiceView2.f283406h.setText(C68924p1.m81172a(noteVoiceView2.getContext(), (int) this.f283416b));
            NoteVoiceView.this.f283403e.setWidth(this.f283418d);
        }

        /* renamed from: c */
        public void mo135018c(double d, int i, boolean z) {
            this.f283419e = C76577a.m92151b(NoteVoiceView.this.getContext(), 0);
            NoteVoiceView.this.f283404f.setImageResource(C0966R.raw.voicepost_beginicon);
            ImageButton imageButton = NoteVoiceView.this.f283404f;
            imageButton.setContentDescription(NoteVoiceView.this.getContext().getResources().getString(C0966R.string.a1s) + NoteVoiceView.this.getContext().getResources().getString(C0966R.string.h_9));
            mo135017b();
            if (z) {
                NoteVoiceView.this.f283404f.setImageResource(C0966R.raw.voicepost_pauseicon);
                NoteVoiceView noteVoiceView = NoteVoiceView.this;
                noteVoiceView.f283404f.setContentDescription(noteVoiceView.getContext().getResources().getString(C0966R.string.a1a));
                sendEmptyMessage(4096);
            }
        }

        public void handleMessage(Message message) {
            this.f283417c = Math.max(0.0f, this.f283417c - 0.256f);
            mo135017b();
            if (this.f283417c > 0.1f) {
                sendEmptyMessageDelayed(4096, 256);
            }
        }
    }

    public NoteVoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.bld, this, true);
    }

    /* renamed from: e */
    public static void m124185e(NoteVoiceView noteVoiceView) {
        Log.m105919d("MicroMsg.NoteVoiceView", "start play, path[%s] voiceType[%d]", noteVoiceView.f283409n, Integer.valueOf(noteVoiceView.f283410o));
        if (noteVoiceView.f283411p.mo135023f(noteVoiceView.f283409n, noteVoiceView.f283410o)) {
            noteVoiceView.f283403e.setKeepScreenOn(true);
            C96749c cVar = noteVoiceView.f283412q;
            cVar.f283415a = false;
            cVar.removeMessages(4096);
            cVar.mo135016a(NoteVoiceView.this.f283408j);
            cVar.f283415a = false;
            NoteVoiceView.this.f283404f.setImageResource(C0966R.raw.voicepost_pauseicon);
            NoteVoiceView noteVoiceView2 = NoteVoiceView.this;
            noteVoiceView2.f283404f.setContentDescription(noteVoiceView2.getContext().getResources().getString(C0966R.string.a1a));
            cVar.sendEmptyMessage(4096);
            return;
        }
        C76701a.makeText(noteVoiceView.getContext(), (int) C0966R.string.csa, 1).show();
    }

    /* renamed from: a */
    public void mo135004a(String str) {
    }

    /* renamed from: b */
    public void mo135005b(String str) {
        if (!this.f283409n.equals(str)) {
            C96749c cVar = this.f283412q;
            cVar.f283415a = false;
            cVar.removeMessages(4096);
            cVar.mo135016a(NoteVoiceView.this.f283408j);
            this.f283403e.setKeepScreenOn(false);
        }
    }

    /* renamed from: c */
    public void mo135006c() {
    }

    /* renamed from: d */
    public void mo135007d() {
        C96749c cVar = this.f283412q;
        cVar.f283415a = false;
        cVar.removeMessages(4096);
        cVar.mo135016a(NoteVoiceView.this.f283408j);
        this.f283403e.setKeepScreenOn(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.m105925i("MicroMsg.NoteVoiceView", "on configuration changed, is paused ? %B", Boolean.valueOf(this.f283412q.f283415a));
        C96749c cVar = this.f283412q;
        if (cVar.f283415a) {
            cVar.postDelayed(new C96747a(), 128);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f283402d = (ViewGroup) findViewById(C0966R.C0970id.lav);
        this.f283405g = (TextView) findViewById(C0966R.C0970id.lat);
        this.f283406h = (TextView) findViewById(C0966R.C0970id.lax);
        this.f283403e = (TextView) findViewById(C0966R.C0970id.lau);
        this.f283404f = (ImageButton) findViewById(C0966R.C0970id.las);
        this.f283407i = findViewById(C0966R.C0970id.lbz);
        this.f283412q = new C96749c((C96747a) null);
        this.f283404f.setOnClickListener(new C96748b());
    }

    public void setVoiceHelper(C96750a aVar) {
        this.f283411p = aVar;
        aVar.mo135019b(this);
    }

    public NoteVoiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.bld, this, true);
    }
}
