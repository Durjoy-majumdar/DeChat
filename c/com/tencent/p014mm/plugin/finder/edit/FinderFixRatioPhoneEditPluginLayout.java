package com.tencent.p014mm.plugin.finder.edit;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import me3.C109612c;
import me3.C109623f;
import qh2.C101198e;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "", "path", "Lrx3/b0;", "setOutputSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderFixRatioPhoneEditPluginLayout */
public final class FinderFixRatioPhoneEditPluginLayout extends EditPhotoPluginLayout {

    /* renamed from: com.tencent.mm.plugin.finder.edit.FinderFixRatioPhoneEditPluginLayout$a */
    public static final class C105251a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFixRatioPhoneEditPluginLayout f312704d;

        public C105251a(FinderFixRatioPhoneEditPluginLayout finderFixRatioPhoneEditPluginLayout) {
            this.f312704d = finderFixRatioPhoneEditPluginLayout;
        }

        public final void run() {
            C101198e.C62622a.m73576a(this.f312704d, C101198e.C101199b.EDIT_PHOTO_CROP, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFixRatioPhoneEditPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final void setOutputSize(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(str, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            Log.m105924i("MicroMsg.EditPhotoPluginLayout", "setOutputSize getOption error. path:" + str);
            return;
        }
        Log.m105924i("MicroMsg.EditPhotoPluginLayout", "setOutputSize config[origin[" + options.outWidth + ',' + options.outHeight + "] target[" + 1080 + ',' + 1440 + ']');
        C109623f fVar = getEditPhotoWrapper().f327415o;
        if (fVar != null) {
            ((C109612c) fVar).mo160833q(1080, 1440);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r1 = r1.f272912M;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129855l(h90.C98324b r4) {
        /*
            r3 = this;
            super.mo129855l(r4)
            lh2.r r0 = r3.getEditPhotoWrapper()
            me3.f r0 = r0.f327415o
            if (r0 != 0) goto L_0x000c
            goto L_0x0023
        L_0x000c:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r3.getConfigProvider()
            if (r1 == 0) goto L_0x001d
            android.os.Bundle r1 = r1.f272912M
            if (r1 == 0) goto L_0x001d
            java.lang.String r2 = "crop_fix_ratio"
            float r1 = r1.getFloat(r2)
            goto L_0x001f
        L_0x001d:
            r1 = 1061158912(0x3f400000, float:0.75)
        L_0x001f:
            me3.c r0 = (me3.C109612c) r0
            r0.f328166i = r1
        L_0x0023:
            com.tencent.mm.plugin.finder.edit.FinderFixRatioPhoneEditPluginLayout$a r0 = new com.tencent.mm.plugin.finder.edit.FinderFixRatioPhoneEditPluginLayout$a
            r0.<init>(r3)
            r3.post(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r4 = r4.f288189j
            r3.setOutputSize(r4)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.edit.FinderFixRatioPhoneEditPluginLayout.mo129855l(h90.b):void");
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 67) {
            super.mo14585p(bVar, bundle);
            getPhotoControlUI().f327434j.setVisibility(4);
            getPhotoControlUI().f327435n.setVisibility(4);
            getPhotoControlUI().f327434j.setOnClickListener((View.OnClickListener) null);
            getPhotoControlUI().f327435n.setOnClickListener((View.OnClickListener) null);
            View findViewById = findViewById(C0966R.C0970id.cc_);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = findViewById(C0966R.C0970id.cco);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = findViewById2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (ordinal != 74 && ordinal != 85) {
            if (ordinal == 80) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).finish();
            } else if (ordinal != 81) {
                super.mo14585p(bVar, bundle);
            } else {
                getEditPhotoWrapper().mo160569b();
                getEditPhotoWrapper().mo160570c((C32226l<? super CaptureDataManager.CaptureVideoNormalModel, C13598b0>) null);
            }
        }
    }
}
