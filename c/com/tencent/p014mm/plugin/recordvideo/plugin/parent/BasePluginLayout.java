package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import h90.C98324b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import lh2.C109344g0;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0004X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u000e8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006'"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Landroid/widget/RelativeLayout;", "Llh2/g0;", "", "visibility", "Lrx3/b0;", "setVisibility", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getPluginList", "()Ljava/util/ArrayList;", "pluginList", "", "e", "Z", "isAttached", "()Z", "setAttached", "(Z)V", "", "f", "J", "getStartTimeMs", "()J", "setStartTimeMs", "(J)V", "startTimeMs", "g", "getBrowserTimeMs", "setBrowserTimeMs", "browserTimeMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout */
public abstract class BasePluginLayout extends RelativeLayout implements C109344g0 {

    /* renamed from: d */
    public final ArrayList<C109344g0> f315313d = new ArrayList<>();

    /* renamed from: e */
    public boolean f315314e;

    /* renamed from: f */
    public long f315315f;

    /* renamed from: g */
    public long f315316g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasePluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        for (C109344g0 e : this.f315313d) {
            if (e.mo78564e()) {
                return true;
            }
        }
        return false;
    }

    public final long getBrowserTimeMs() {
        return this.f315316g;
    }

    public final ArrayList<C109344g0> getPluginList() {
        return this.f315313d;
    }

    public final long getStartTimeMs() {
        return this.f315315f;
    }

    /* renamed from: j */
    public final <T extends C109344g0> T mo151221j(Class<T> cls) {
        C87412m.m108594g(cls, "clazz");
        Iterator<T> it = this.f315313d.iterator();
        while (it.hasNext()) {
            T t = (C109344g0) it.next();
            if (C87412m.m108589b(t.name(), cls.getName())) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        for (C109344g0 v : this.f315313d) {
            v.mo78575v(recordConfigProvider);
        }
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        onAttach();
        reset();
        setVisibility(0);
    }

    public String name() {
        return getClass().getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        for (C109344g0 onActivityResult : this.f315313d) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public void onAttach() {
        this.f315314e = true;
        for (C109344g0 onAttach : this.f315313d) {
            onAttach.onAttach();
        }
    }

    public void onDetach() {
        this.f315316g = System.currentTimeMillis() - this.f315315f;
        this.f315314e = false;
        for (C109344g0 onDetach : this.f315313d) {
            onDetach.onDetach();
        }
    }

    public void onPause() {
        for (C109344g0 onPause : this.f315313d) {
            onPause.onPause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
        for (C109344g0 onRequestPermissionsResult : this.f315313d) {
            onRequestPermissionsResult.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        this.f315315f = System.currentTimeMillis();
        for (C109344g0 onResume : this.f315313d) {
            onResume.onResume();
        }
    }

    public void release() {
        for (C109344g0 release : this.f315313d) {
            release.release();
        }
    }

    public void reset() {
        for (C109344g0 reset : this.f315313d) {
            reset.reset();
        }
    }

    public final void setAttached(boolean z) {
        this.f315314e = z;
    }

    public final void setBrowserTimeMs(long j) {
        this.f315316g = j;
    }

    public final void setStartTimeMs(long j) {
        this.f315315f = j;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            onResume();
        } else {
            onPause();
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
