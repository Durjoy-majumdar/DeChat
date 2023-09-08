package com.tencent.p014mm.xwebutil;

import android.content.BroadcastReceiver;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.xwebutil.C19905j;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.xweb.FileReaderHelper;
import java.lang.ref.WeakReference;
import p206nj.C100115c;

/* renamed from: com.tencent.mm.xwebutil.k */
public class C19909k {

    /* renamed from: a */
    public WeakReference<MMActivity> f56741a;

    /* renamed from: b */
    public WeakReference<WeImageView> f56742b;

    /* renamed from: c */
    public WeakReference<XWebAudioPlayerProgress> f56743c;

    /* renamed from: d */
    public String f56744d;

    /* renamed from: e */
    public String f56745e;

    /* renamed from: f */
    public String f56746f;

    /* renamed from: g */
    public FileReaderHelper.AudioPlayerStrategy f56747g;

    /* renamed from: h */
    public ITPPlayer f56748h;

    /* renamed from: i */
    public C19905j.C19907b f56749i;

    /* renamed from: j */
    public C100115c f56750j;

    /* renamed from: k */
    public C100115c.C100116a f56751k;

    /* renamed from: l */
    public WeakReference<BroadcastReceiver> f56752l;

    /* renamed from: m */
    public ValueCallback<Integer> f56753m;

    /* renamed from: n */
    public boolean f56754n = false;

    public C19909k(MMActivity mMActivity, RelativeLayout relativeLayout, View view, RelativeLayout relativeLayout2, WeImageView weImageView, XWebAudioPlayerProgress xWebAudioPlayerProgress, String str, String str2, String str3, String str4, long j, long j2, long j3, FileReaderHelper.AudioPlayerStrategy audioPlayerStrategy, ITPPlayer iTPPlayer, C19905j.C19907b bVar, C100115c cVar, C100115c.C100116a aVar, BroadcastReceiver broadcastReceiver, ValueCallback<Integer> valueCallback) {
        MMActivity mMActivity2 = mMActivity;
        this.f56741a = new WeakReference<>(mMActivity);
        RelativeLayout relativeLayout3 = relativeLayout;
        new WeakReference(relativeLayout);
        View view2 = view;
        new WeakReference(view);
        RelativeLayout relativeLayout4 = relativeLayout2;
        new WeakReference(relativeLayout2);
        WeImageView weImageView2 = weImageView;
        this.f56742b = new WeakReference<>(weImageView);
        XWebAudioPlayerProgress xWebAudioPlayerProgress2 = xWebAudioPlayerProgress;
        this.f56743c = new WeakReference<>(xWebAudioPlayerProgress);
        this.f56744d = str;
        this.f56745e = str3;
        this.f56746f = str4;
        this.f56747g = audioPlayerStrategy;
        this.f56748h = iTPPlayer;
        this.f56749i = bVar;
        this.f56750j = cVar;
        this.f56751k = aVar;
        this.f56752l = new WeakReference<>(broadcastReceiver);
        this.f56753m = valueCallback;
    }

    /* renamed from: a */
    public MMActivity mo26672a() {
        WeakReference<MMActivity> weakReference = this.f56741a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: b */
    public XWebAudioPlayerProgress mo26673b() {
        WeakReference<XWebAudioPlayerProgress> weakReference = this.f56743c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
