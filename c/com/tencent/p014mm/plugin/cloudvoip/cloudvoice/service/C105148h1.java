package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.text.TextPaint;
import android.util.Size;
import android.view.TextureView;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.Timer;
import js0.C88020k;
import n11.C109669c;
import org.json.JSONObject;
import u11.C111099b;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h1 */
public class C105148h1 extends MMTextureView implements C105130c, C85148d, TextureView.SurfaceTextureListener, C111099b.C111101b {

    /* renamed from: h */
    public int f312198h = 0;

    /* renamed from: i */
    public Paint f312199i = null;

    /* renamed from: j */
    public String f312200j = "";

    /* renamed from: n */
    public int f312201n = -1;

    /* renamed from: o */
    public int f312202o;

    /* renamed from: p */
    public int f312203p;

    /* renamed from: q */
    public int f312204q = 0;

    /* renamed from: r */
    public int f312205r = 0;

    /* renamed from: s */
    public TextPaint f312206s = null;

    /* renamed from: t */
    public MMHandler f312207t;

    /* renamed from: u */
    public Timer f312208u;

    /* renamed from: v */
    public boolean f312209v = false;

    /* renamed from: w */
    public int f312210w = 0;

    /* renamed from: x */
    public boolean f312211x = false;

    /* renamed from: y */
    public boolean f312212y = false;

    /* renamed from: z */
    public Size f312213z = new Size(0, 0);

    public C105148h1(Context context, C109669c cVar, JSONObject jSONObject) {
        super(context);
        this.f312201n = cVar.f328293a;
        this.f312200j = cVar.f328294b;
        Paint paint = new Paint();
        this.f312199i = paint;
        paint.setColor(-16777216);
        this.f312199i.setFilterBitmap(false);
        setSurfaceTextureListener(this);
        mo149439r(jSONObject);
        if (jSONObject.optBoolean("debug", false)) {
            TextPaint textPaint = new TextPaint();
            this.f312206s = textPaint;
            textPaint.setColor(-65536);
            this.f312206s.setTextSize(25.0f);
            this.f312206s.setAntiAlias(true);
            this.f312209v = false;
            this.f312208u = new Timer("CloudVoIP_video_info");
            this.f312207t = new MMHandler();
            if (this.f312208u != null && !this.f312209v) {
                this.f312209v = true;
                this.f312208u.schedule(new C105144g1(this), 1000, 1000);
            }
        }
    }

    /* renamed from: b */
    public void mo149459b() {
    }

    public int getLogicHeight() {
        int i = this.f312205r;
        return i > 0 ? i : C88020k.m109554e(getHeight());
    }

    public int getLogicWidth() {
        int i = this.f312204q;
        return i > 0 ? i : C88020k.m109554e(getWidth());
    }

    public int getMemberId() {
        return this.f312201n;
    }

    public String getOpenId() {
        return this.f312200j;
    }

    public Size getRenderSize() {
        return this.f312213z;
    }

    public Object getRenderTarget() {
        return getSurfaceTexture();
    }

    public int getSameLayerSurfaceHeight() {
        return this.f312203p;
    }

    public int getSameLayerSurfaceWidth() {
        return this.f312202o;
    }

    public int getScaleType() {
        return this.f312210w;
    }

    public int getViewId() {
        return this.f312198h;
    }

    /* renamed from: h */
    public void mo149436h(int i) {
        if (i != this.f312201n) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoView", "updateMemberId, viewId:" + this.f312198h + ", openId:" + this.f312200j + ", memberId:[" + this.f312201n + "->" + i + "]");
            this.f312201n = i;
        }
    }

    /* renamed from: l */
    public boolean mo149437l() {
        return this instanceof C105155l;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceTextureAvailable, surface:");
        sb.append(surfaceTexture == null ? "isNull" : "nonNull");
        sb.append(", viewId:");
        sb.append(this.f312198h);
        sb.append(", openId:");
        sb.append(this.f312200j);
        sb.append(", mId:");
        sb.append(this.f312201n);
        sb.append(", width:");
        sb.append(i);
        sb.append(", height:");
        sb.append(i2);
        sb.append(", size: [");
        sb.append(getWidth());
        sb.append(",");
        sb.append(getHeight());
        sb.append("]");
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoView", sb.toString());
        mo82024B();
        this.f312213z = new Size(i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoView", "onSurfaceTextureDestroyed, viewId:" + this.f312198h + ", openId:" + this.f312200j + ", mId:" + this.f312201n);
        Timer timer = this.f312208u;
        if (timer != null) {
            timer.cancel();
            this.f312208u = null;
        }
        MMHandler mMHandler = this.f312207t;
        if (mMHandler == null) {
            return false;
        }
        mMHandler.removeCallbacksAndMessages((Object) null);
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoView", "onSurfaceTextureSizeChanged, viewId:" + this.f312198h + ", openId:" + this.f312200j + ", mId:" + this.f312201n + ", width:" + i + ", height:" + i2 + ", size: [" + getWidth() + "," + getHeight() + "]");
        this.f312213z = new Size(i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: p */
    public void mo149438p() {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoView", "uint, viewId:" + this.f312198h + ", openId:" + this.f312200j + ", memberId:" + this.f312201n);
        synchronized (this) {
        }
    }

    /* renamed from: r */
    public void mo149439r(JSONObject jSONObject) {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoView", "update, viewId:" + this.f312198h + ", openId:" + this.f312200j + ", memberId:" + this.f312201n + ", data:" + jSONObject.toString());
        mo149438p();
        mo149440v(jSONObject);
    }

    public void setScreenOri(int i) {
    }

    /* renamed from: u */
    public void mo118171u(int i, int i2) {
        this.f312204q = i;
        this.f312205r = i2;
    }

    /* renamed from: v */
    public void mo149440v(JSONObject jSONObject) {
        this.f312198h = jSONObject.optInt("viewId");
        String optString = jSONObject.optString(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, "fill");
        if (optString.equals("fill")) {
            this.f312210w = 0;
        } else if (optString.equals("contain")) {
            this.f312210w = 1;
        } else if (optString.equals("cover")) {
            this.f312210w = 2;
        }
        String optString2 = jSONObject.optString("type", "camera");
        if (optString2.equals("video")) {
            this.f312211x = true;
        } else if (optString2.equals("screen")) {
            this.f312212y = true;
        }
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoView", "init, viewId:" + this.f312198h + ", openId:" + this.f312200j + ", memberId:" + this.f312201n + ", data:" + jSONObject.toString());
        synchronized (this) {
        }
    }

    /* renamed from: w */
    public boolean mo149441w() {
        return this.f312211x;
    }

    /* renamed from: y */
    public boolean mo149442y() {
        return this.f312212y;
    }

    /* renamed from: z */
    public void mo118172z(int i, int i2) {
        this.f312202o = i;
        this.f312203p = i2;
        this.f312213z = new Size(i, i2);
    }
}
