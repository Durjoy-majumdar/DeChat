package com.tencent.p014mm.plugin.finder.edit;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import qh2.C101198e;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderFixPhotoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout */
public final class FinderFixPhotoEditPluginLayout extends EditPhotoPluginLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f312700w = 0;

    /* renamed from: com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout$a */
    public static final class C105248a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFixPhotoEditPluginLayout f312701d;

        public C105248a(FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout) {
            this.f312701d = finderFixPhotoEditPluginLayout;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout r0 = r3.f312701d
                android.content.Context r0 = r0.getContext()
                boolean r1 = r0 instanceof android.app.Activity
                r2 = 0
                if (r1 == 0) goto L_0x000e
                android.app.Activity r0 = (android.app.Activity) r0
                goto L_0x000f
            L_0x000e:
                r0 = r2
            L_0x000f:
                if (r0 == 0) goto L_0x0016
                r1 = 10013(0x271d, float:1.4031E-41)
                r0.setResult(r1)
            L_0x0016:
                com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout r0 = r3.f312701d
                android.content.Context r0 = r0.getContext()
                boolean r1 = r0 instanceof android.app.Activity
                if (r1 == 0) goto L_0x0023
                r2 = r0
                android.app.Activity r2 = (android.app.Activity) r2
            L_0x0023:
                if (r2 == 0) goto L_0x0028
                r2.finish()
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout.C105248a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout$b */
    public static final class C105249b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFixPhotoEditPluginLayout f312702d;

        /* renamed from: com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout$b$a */
        public static final class C105250a extends C87413o implements C32226l<CaptureDataManager.CaptureVideoNormalModel, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderFixPhotoEditPluginLayout f312703d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105250a(FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout) {
                super(1);
                this.f312703d = finderFixPhotoEditPluginLayout;
            }

            /* JADX WARNING: type inference failed for: r3v6, types: [android.content.Context] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke(java.lang.Object r3) {
                /*
                    r2 = this;
                    com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r3 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r3
                    java.lang.String r0 = "it"
                    gy3.C87412m.m108594g(r3, r0)
                    com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout r3 = r2.f312703d
                    android.content.Context r3 = r3.getContext()
                    boolean r0 = r3 instanceof android.app.Activity
                    r1 = 0
                    if (r0 == 0) goto L_0x0015
                    android.app.Activity r3 = (android.app.Activity) r3
                    goto L_0x0016
                L_0x0015:
                    r3 = r1
                L_0x0016:
                    if (r3 == 0) goto L_0x001d
                    r0 = 10013(0x271d, float:1.4031E-41)
                    r3.setResult(r0)
                L_0x001d:
                    com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout r3 = r2.f312703d
                    android.content.Context r3 = r3.getContext()
                    boolean r0 = r3 instanceof android.app.Activity
                    if (r0 == 0) goto L_0x002a
                    r1 = r3
                    android.app.Activity r1 = (android.app.Activity) r1
                L_0x002a:
                    if (r1 == 0) goto L_0x002f
                    r1.finish()
                L_0x002f:
                    rx3.b0 r3 = rx3.C13598b0.f38549a
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout.C105249b.C105250a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        public C105249b(FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout) {
            this.f312702d = finderFixPhotoEditPluginLayout;
        }

        public final void run() {
            FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout = this.f312702d;
            int i = FinderFixPhotoEditPluginLayout.f312700w;
            finderFixPhotoEditPluginLayout.getEditPhotoWrapper().mo160570c(new C105250a(this.f312702d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFixPhotoEditPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        ArtistCacheManager.m140185a().mo148159b();
    }

    /* renamed from: e */
    public boolean mo78564e() {
        postDelayed(new C105248a(this), 300);
        return true;
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 29) {
            mo78564e();
        } else if (ordinal == 62) {
            postDelayed(new C105249b(this), 300);
        } else if (ordinal != 67) {
            super.mo14585p(bVar, bundle);
        } else {
            super.mo14585p(bVar, bundle);
        }
    }
}
