package com.tencent.p014mm.plugin.finder.live.multistream.panel.preview;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import er1.C58739j4;
import f50.C58915a;
import f50.C58916b;
import f50.C58923c;
import f50.C58924d;
import gy3.C87412m;
import kotlin.Metadata;
import oj1.C62033a;
import te3.C64890zp2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamPreviewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView */
public final class MultiStreamPreviewView extends FrameLayout {

    /* renamed from: d */
    public C58924d f159477d;

    /* renamed from: e */
    public TXCloudVideoView f159478e;

    /* renamed from: f */
    public ImageView f159479f;

    /* renamed from: g */
    public C62033a f159480g;

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView$a */
    public final class C55949a extends C58915a {
        public C55949a() {
        }

        public void onNetStatus(Bundle bundle) {
        }

        public void onPlayEvent(int i, Bundle bundle) {
            super.onPlayEvent(i, bundle);
            C58924d dVar = MultiStreamPreviewView.this.f159477d;
            boolean z = true;
            if (!(dVar != null && ((C58916b) dVar).isPlaying())) {
                return;
            }
            if (i == -2301) {
                if (NetStatusUtil.getNetType(MultiStreamPreviewView.this.getContext()) != -1) {
                    z = false;
                }
                System.out.print("onPlayEvent PLAY_ERR_NET_DISCONNECT, non_network:" + z);
                C58924d dVar2 = MultiStreamPreviewView.this.f159477d;
                if (dVar2 != null) {
                    ((C58916b) dVar2).stopPlay(false);
                }
            } else if (i == 2001) {
                StringBuilder sb = new StringBuilder();
                sb.append("onPlayEvent ");
                sb.append(i == 2004 ? "PLAY_EVT_PLAY_BEGIN" : "PLAY_EVT_CONNECT_SUCC");
                System.out.print(sb.toString());
            } else if (i == 2003) {
                MultiStreamPreviewView multiStreamPreviewView = MultiStreamPreviewView.this;
                C62033a aVar = multiStreamPreviewView.f159480g;
                if (aVar != null) {
                    C64890zp2 zp22 = aVar.f176353f;
                    if (zp22 == null || zp22.f186801V < zp22.f186802W) {
                        z = false;
                    }
                    if (z) {
                        ImageView imageView = multiStreamPreviewView.f159479f;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        } else {
                            C87412m.m108603p("bgView");
                            throw null;
                        }
                    } else {
                        ImageView imageView2 = multiStreamPreviewView.f159479f;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        } else {
                            C87412m.m108603p("bgView");
                            throw null;
                        }
                    }
                }
            } else if (i == 2103) {
                if (NetStatusUtil.getNetType(MultiStreamPreviewView.this.getContext()) != -1) {
                    z = false;
                }
                System.out.print("onPlayEvent PLAY_WARNING_RECONNECT, non_network:" + z);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiStreamPreviewView(Context context) {
        super(context.getApplicationContext());
        C87412m.m108594g(context, "context");
        mo77683a(context);
    }

    /* renamed from: a */
    public final void mo77683a(Context context) {
        C87412m.m108594g(context, "context");
        this.f159478e = new TXCloudVideoView(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(8);
        this.f159479f = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ImageView imageView2 = this.f159479f;
        if (imageView2 != null) {
            addView(imageView2, layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            TXCloudVideoView tXCloudVideoView = this.f159478e;
            if (tXCloudVideoView != null) {
                addView(tXCloudVideoView, layoutParams2);
                C58923c cVar = new C58923c(context);
                this.f159477d = cVar;
                cVar.enableHardwareDecode(true);
                C58924d dVar = this.f159477d;
                if (dVar != null) {
                    dVar.setPlayListener(new C55949a());
                }
                C58924d dVar2 = this.f159477d;
                if (dVar2 != null) {
                    dVar2.setConfig(C58739j4.m68256z(C58739j4.f168176a, true, 0, 2, (Object) null));
                }
                C58924d dVar3 = this.f159477d;
                if (dVar3 != null) {
                    dVar3.setMute(true);
                    return;
                }
                return;
            }
            C87412m.m108603p("videoView");
            throw null;
        }
        C87412m.m108603p("bgView");
        throw null;
    }

    /* renamed from: b */
    public final void mo77684b() {
        StringBuilder sb = new StringBuilder();
        sb.append("stopPlay: ");
        sb.append(this.f159477d);
        sb.append(" hashCode: ");
        C58924d dVar = this.f159477d;
        sb.append(dVar != null ? dVar.hashCode() : 0);
        Log.m105924i("MultiStreamPreviewView", sb.toString());
        C58924d dVar2 = this.f159477d;
        if (dVar2 != null) {
            ((C58916b) dVar2).stopPlay(true);
        }
        ImageView imageView = this.f159479f;
        if (imageView != null) {
            imageView.setVisibility(8);
        } else {
            C87412m.m108603p("bgView");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiStreamPreviewView(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        C87412m.m108594g(context, "context");
        mo77683a(context);
    }
}
