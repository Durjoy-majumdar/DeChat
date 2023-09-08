package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.fts.p059ui.widget.VoiceInputLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import kv1.C99252h;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.c */
public class C18874c {

    /* renamed from: a */
    public MMActivity f52919a;

    /* renamed from: b */
    public C18877c f52920b;

    /* renamed from: c */
    public boolean f52921c = false;

    /* renamed from: d */
    public FTSVoiceInputLayoutImpl f52922d;

    /* renamed from: e */
    public TextView f52923e;

    /* renamed from: f */
    public ProgressBar f52924f;

    /* renamed from: g */
    public long f52925g;

    /* renamed from: h */
    public long f52926h;

    /* renamed from: i */
    public long f52927i;

    /* renamed from: j */
    public FTSVoiceInputLayoutImpl$$h f52928j;

    /* renamed from: k */
    public Toast f52929k;

    /* renamed from: l */
    public VoiceInputLayout.C18863d f52930l;

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.c$a */
    public class C18875a implements FTSVoiceInputLayoutImpl$$h {

        /* renamed from: a */
        public String f52931a = "";

        /* renamed from: b */
        public String f52932b = "";

        public C18875a() {
        }

        /* renamed from: a */
        public void mo23868a() {
            Log.m105918d("MicroMsg.FTSVoiceInputHelper", "onDetectStop");
        }

        /* renamed from: b */
        public void mo23869b() {
            this.f52931a = "";
            this.f52932b = "";
            Log.m105918d("MicroMsg.FTSVoiceInputHelper", "onDetectStart");
            C115669n.INSTANCE.mo160131h(15490, 3, Long.valueOf(C99252h.f291030c), 1);
            Log.m105919d("MicroMsg.FTSVoiceInputHelper", "15490 type:3, sessionId:%s, voicever:%s", Long.valueOf(C99252h.f291030c), 1);
            C18874c cVar = C18874c.this;
            cVar.f52921c = true;
            cVar.f52920b.mo23776d();
        }

        /* renamed from: c */
        public void mo23870c(int i, int i2, int i3) {
            C18874c.this.f52921c = false;
            mo23879k();
            if (i == 12) {
                C18874c.this.f52920b.mo23774b(false, true, this.f52931a);
            } else {
                C18874c.this.f52920b.mo23774b(false, false, this.f52931a);
            }
        }

        /* renamed from: d */
        public void mo23871d(String[] strArr, List<String> list) {
            if (strArr != null && strArr.length > 0 && strArr[0].length() > 0) {
                this.f52931a = strArr[0];
                Log.m105918d("MicroMsg.FTSVoiceInputHelper", "onDetected text content: " + this.f52931a);
                mo23878j();
            }
            if (list != null && !list.isEmpty() && list.iterator().hasNext()) {
                String next = list.iterator().next();
                this.f52932b = next;
                Log.m105919d("MicroMsg.FTSVoiceInputHelper", "set voiceId:%s", next);
            }
        }

        /* renamed from: e */
        public void mo23872e() {
            Log.m105918d("MicroMsg.FTSVoiceInputHelper", "onStateReset");
        }

        /* renamed from: f */
        public void mo23873f() {
            Log.m105918d("MicroMsg.FTSVoiceInputHelper", "onDetectFinish");
            mo23879k();
            C18874c.this.f52921c = false;
            mo23878j();
            C18874c.this.f52924f.setVisibility(8);
            C18874c.this.f52920b.mo23773a(this.f52932b, this.f52931a);
            this.f52931a = "";
            this.f52932b = "";
        }

        /* renamed from: g */
        public void mo23874g() {
            Log.m105918d("MicroMsg.FTSVoiceInputHelper", "onDetectCancel");
        }

        /* renamed from: h */
        public void mo23858h() {
            C18874c.this.f52926h = System.currentTimeMillis();
            if (C18874c.this.f52921c && !Util.isNullOrNil(this.f52931a)) {
                C18874c.this.f52922d.setVisibility(8);
            }
        }

        /* renamed from: i */
        public void mo23859i() {
            C18874c.this.f52925g = System.currentTimeMillis();
        }

        /* renamed from: j */
        public final void mo23878j() {
            if (this.f52931a.length() > 0) {
                this.f52931a = this.f52931a.replaceAll("。", " ").replaceAll("\\.", " ").replaceAll("，", " ").replaceAll(",", " ").trim();
            }
            C18874c.this.f52923e.setText(this.f52931a);
            C18874c.this.f52924f.setVisibility(0);
            C18874c.this.f52920b.mo23775c(this.f52931a);
        }

        /* renamed from: k */
        public final void mo23879k() {
            C18874c.this.f52927i = System.currentTimeMillis();
            C18874c cVar = C18874c.this;
            long j = cVar.f52926h;
            if (j <= 0) {
                j = cVar.f52927i;
            }
            cVar.f52926h = j;
            int i = Util.isNullOrNil(this.f52931a) ? 2 : 1;
            C18874c cVar2 = C18874c.this;
            long j2 = cVar2.f52926h;
            long j3 = cVar2.f52925g;
            long j4 = j2 - j3;
            long j5 = cVar2.f52927i - j3;
            C115669n.INSTANCE.mo160131h(16346, Integer.valueOf(i), Long.valueOf(C99252h.f291030c), Long.valueOf(j4), Long.valueOf(j5));
            Log.m105925i("MicroMsg.FTSVoiceInputHelper", "16346 actionType:%s, searchId:%s, voiceTime:%s, tranTime:%s", Integer.valueOf(i), Long.valueOf(C99252h.f291030c), Long.valueOf(j4), Long.valueOf(j5));
            C18874c cVar3 = C18874c.this;
            cVar3.f52925g = 0;
            cVar3.f52926h = 0;
            cVar3.f52927i = 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.c$b */
    public class C18876b implements VoiceInputLayout.C18863d {
        public C18876b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.c$c */
    public interface C18877c {
        /* renamed from: a */
        void mo23773a(String str, String str2);

        /* renamed from: b */
        void mo23774b(boolean z, boolean z2, String str);

        /* renamed from: c */
        void mo23775c(String str);

        /* renamed from: d */
        void mo23776d();
    }

    public C18874c(Context context, FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl, TextView textView, ProgressBar progressBar) {
        C18875a aVar = new C18875a();
        this.f52928j = aVar;
        this.f52930l = new C18876b();
        this.f52919a = (MMActivity) context;
        this.f52922d = fTSVoiceInputLayoutImpl;
        this.f52923e = textView;
        this.f52924f = progressBar;
        fTSVoiceInputLayoutImpl.setFTSVoiceDetectListener(aVar);
        this.f52922d.setLongClickLisnter(this.f52930l);
    }
}
