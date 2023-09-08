package com.tencent.p014mm.plugin.webview.fts.p810ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import r83.C89906f;

/* renamed from: com.tencent.mm.plugin.webview.fts.ui.a */
public class C96638a {

    /* renamed from: a */
    public Context f282994a;

    /* renamed from: b */
    public View f282995b;

    /* renamed from: c */
    public C96640b f282996c = C96640b.None;

    /* renamed from: d */
    public GestureDetector f282997d;

    /* renamed from: e */
    public C96641c f282998e;

    /* renamed from: f */
    public float f282999f = 0.0f;

    /* renamed from: g */
    public int f283000g = 0;

    /* renamed from: h */
    public float f283001h = 0.0f;

    /* renamed from: i */
    public int f283002i = -1;

    /* renamed from: j */
    public int f283003j = 0;

    /* renamed from: k */
    public Runnable f283004k = new C96639a();

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.a$a */
    public class C96639a implements Runnable {
        public C96639a() {
        }

        public void run() {
            C96643c cVar = (C96643c) C96638a.this.f282998e;
            cVar.getClass();
            Log.m105918d("MicroMsg.FtsWebVideoView", "onSingleTap");
            FtsWebVideoView ftsWebVideoView = cVar.f283012a;
            int i = FtsWebVideoView.f282938V;
            boolean z = false;
            if (ftsWebVideoView.f282978z) {
                if (!(ftsWebVideoView.f282963h.getVisibility() == 0)) {
                    z = true;
                }
            }
            if (z) {
                FtsWebVideoView ftsWebVideoView2 = cVar.f283012a;
                ftsWebVideoView2.f282962g.mo134723B(ftsWebVideoView2.f282951M);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.a$b */
    public enum C96640b {
        None,
        Volume,
        Brightness,
        FastBackwardOrForward
    }

    /* renamed from: com.tencent.mm.plugin.webview.fts.ui.a$c */
    public interface C96641c {
    }

    public C96638a(Context context, View view, C96641c cVar) {
        this.f282994a = context;
        this.f282998e = cVar;
        this.f282995b = view;
        this.f282997d = new GestureDetector(this.f282994a, new C96642b(this));
        this.f282999f = C89906f.m112429b(context);
    }
}
