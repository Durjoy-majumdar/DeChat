package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import p447aw.C103918d;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordCheckAudioPermissionPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseScopePluginLayout;", "", "j", "Z", "getCheckAudioPermission", "()Z", "setCheckAudioPermission", "(Z)V", "checkAudioPermission", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout */
public abstract class RecordCheckAudioPermissionPluginLayout extends BaseScopePluginLayout {

    /* renamed from: j */
    public boolean f315404j;

    /* renamed from: n */
    public RecordConfigProvider f315405n;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout$a */
    public static final class C105978a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecordCheckAudioPermissionPluginLayout f315406d;

        public C105978a(RecordCheckAudioPermissionPluginLayout recordCheckAudioPermissionPluginLayout) {
            this.f315406d = recordCheckAudioPermissionPluginLayout;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f315406d.setCheckAudioPermission(true);
            Context context = this.f315406d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7((Activity) context);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout$b */
    public static final class C105979b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecordCheckAudioPermissionPluginLayout f315407d;

        public C105979b(RecordCheckAudioPermissionPluginLayout recordCheckAudioPermissionPluginLayout) {
            this.f315407d = recordCheckAudioPermissionPluginLayout;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f315407d.mo149733o(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordCheckAudioPermissionPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final boolean getCheckAudioPermission() {
        return this.f315404j;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        this.f315405n = recordConfigProvider;
        mo149732n();
    }

    /* renamed from: n */
    public boolean mo149732n() {
        RecordConfigProvider recordConfigProvider = this.f315405n;
        if (recordConfigProvider != null ? C87412m.m108589b(recordConfigProvider.f272932t, Boolean.FALSE) : false) {
            Log.m105924i("MicroMsg.RecordPluginLayout", "jump check audio permission");
            return true;
        }
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) context, "android.permission.RECORD_AUDIO", 80, "", "");
        Log.m105924i("MicroMsg.RecordCheckAudioPermissionPluginLayout", "checkAudioPermission " + z1 + " !");
        return z1;
    }

    /* renamed from: o */
    public abstract void mo149733o(boolean z);

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        Log.m105924i("MicroMsg.RecordCheckAudioPermissionPluginLayout", "onRequestPermissionsResult requestCode:" + i + " permissions:" + strArr + " grantResults:" + iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 80) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                C76879j.m92709C(getContext(), C76577a.m92166q(getContext(), C0966R.string.htg), C76577a.m92166q(getContext(), C0966R.string.hti), C76577a.m92166q(getContext(), C0966R.string.hth), C76577a.m92166q(getContext(), C0966R.string.htf), false, new C105978a(this), new C105979b(this));
            } else {
                mo149733o(true);
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f315404j) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            mo149733o(((C103918d) C86312j.m106911c(C103918d.class)).Gd0((Activity) context, "android.permission.RECORD_AUDIO"));
        }
    }

    public final void setCheckAudioPermission(boolean z) {
        this.f315404j = z;
    }
}
