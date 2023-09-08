package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.music.p080ui.view.MarqueeLyricView;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import la2.C99358f;
import la2.C99364n;
import qc0.C101106m;
import ra2.C101365a;
import ua2.C101991b;

/* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView */
public class FloatBallMusicLyricView extends LinearLayout {

    /* renamed from: i */
    public static final /* synthetic */ int f272190i = 0;

    /* renamed from: d */
    public TextView f272191d;

    /* renamed from: e */
    public MarqueeLyricView f272192e;

    /* renamed from: f */
    public C101365a f272193f;

    /* renamed from: g */
    public C94223g.C94224a f272194g;

    /* renamed from: h */
    public IListener f272195h;

    /* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView$a */
    public class C94229a implements C94223g.C94224a {
        public C94229a() {
        }

        /* renamed from: a */
        public void mo80435a(int i, int i2) {
            if (i >= 0 && i2 > 0) {
                FloatBallMusicLyricView floatBallMusicLyricView = FloatBallMusicLyricView.this;
                floatBallMusicLyricView.getClass();
                MMHandlerThread.postToMainThread(new C94240a(floatBallMusicLyricView, (long) i));
            }
        }
    }

    public FloatBallMusicLyricView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setMusicLyric(String str) {
        Class cls = C99358f.class;
        Log.m105925i("MicroMsg.FloatBallMusicLyricView", "alvinluo setMusicLyric: %s", str);
        if (this.f272192e != null) {
            C101365a U = ((C99358f) C101991b.m134284b(cls)).mo138809U();
            this.f272193f = U;
            if (U == null) {
                this.f272192e.setVisibility(8);
            } else if (Util.isNullOrNil(U.field_songHAlbumUrl)) {
                this.f272192e.setVisibility(8);
                ((C99358f) C101991b.m134284b(cls)).mo138814h0(this.f272193f, false, false);
            } else {
                this.f272192e.setVisibility(8);
            }
        }
    }

    private void setMusicTitle(String str) {
        TextView textView = this.f272191d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setMusicWrapper(C101106m mVar) {
        setMusicTitle(mVar.f295962g);
        setMusicLyric(mVar.f295969q);
    }

    public FloatBallMusicLyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f272193f = null;
        this.f272194g = new C94229a();
        this.f272195h = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
                if (musicPlayerEvent.f9336d.f9337a != 6) {
                    return false;
                }
                MMHandlerThread.postToMainThread(new C94241b(this, musicPlayerEvent));
                return false;
            }
        };
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.arp, this, true);
        this.f272191d = (TextView) findViewById(C0966R.C0970id.h7a);
        this.f272192e = (MarqueeLyricView) findViewById(C0966R.C0970id.h6q);
        this.f272195h.alive();
        C99364n.m129616h().mo138823b(this.f272194g);
    }
}
