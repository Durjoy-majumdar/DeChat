package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bd1.C0264h;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58784w3;
import er1.C7919x;
import f40.C86709a0;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import je1.C9377s4;
import k60.C60979d;
import kg3.C76577a;
import kotlin.Metadata;
import lu3.C34379c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p629ny.C76979h;
import p823sg.C101614i;
import pe3.C47465a;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C77407n;
import qo3.C89779i0;
import rl0.C90004e;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49236e51;
import te3.C49316ep1;
import te3.C49712hj1;
import te3.C50019jp1;
import te3.C50428mo1;
import te3.C51583uq0;
import te3.C51691vg0;
import te3.C51810wb1;
import te3.C51869ws0;
import te3.C52271zj0;
import up1.C27696y;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper;", "", "()V", "Companion", "UserInfoHelper", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper */
public final class FinderBottomCustomDialogHelper {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "FinderBottomCustomDialogHelper";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J@\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bJ*\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006JP\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tJ2\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tJ\"\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010J(\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b&\u0010'J\u0001\u0010)\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J\u0001\u0010,\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion;", "", "Landroid/content/Context;", "context", "", "finderUserName", "Landroid/content/DialogInterface$OnClickListener;", "lok", "lcancel", "Landroid/content/DialogInterface$OnDismissListener;", "dismiss", "", "alwaysDarkMode", "Lrx3/b0;", "showUserInfoConfirmDialog", "showUserInfoConfirmDialogOnLiveRedPacket", "Landroid/app/Activity;", "", "scene", "Landroid/content/Intent;", "intent", "requestCode", "ldismiss", "showCreateFinderUserDialogOnLiveWithCallback", "showRealNameCertificationDialogWithCallback", "showCreateFinderUserDialog", "showRealNameCertificationDialog", "title", "content", "showOverSeaAgreeConfirmDiaglog", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "iconColor", "msg", "ok", "cancel", "btnStyle", "Lqo3/n;", "showConfirmMsgDialog", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)Lqo3/n;", "Landroid/view/View;", "showConfirmDialog", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;ILjava/lang/String;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;Z)Lqo3/n;", "showFinderIcon", "showConfirmTextDialog", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/Boolean;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)Lqo3/n;", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public static /* synthetic */ C77407n showConfirmDialog$default(Companion companion, Context context, Drawable drawable, int i, String str, View view, String str2, String str3, Integer num, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, boolean z, int i2, Object obj) {
            int i3 = i2;
            return companion.showConfirmDialog(context, (i3 & 2) != 0 ? null : drawable, (i3 & 4) != 0 ? -1 : i, str, view, str2, str3, (i3 & 128) != 0 ? 0 : num, onClickListener, (i3 & 512) != 0 ? null : onClickListener2, (i3 & 1024) != 0 ? null : onDismissListener, (i3 & 2048) != 0 ? false : z);
        }

        public static /* synthetic */ C77407n showConfirmMsgDialog$default(Companion companion, Context context, Drawable drawable, int i, String str, String str2, String str3, String str4, Integer num, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, int i2, Object obj) {
            int i3 = i2;
            return companion.showConfirmMsgDialog(context, (i3 & 2) != 0 ? null : drawable, (i3 & 4) != 0 ? -1 : i, str, str2, str3, str4, (i3 & 128) != 0 ? 0 : num, onClickListener, (i3 & 512) != 0 ? null : onClickListener2, (i3 & 1024) != 0 ? null : onDismissListener);
        }

        public static /* synthetic */ C77407n showConfirmTextDialog$default(Companion companion, Context context, Drawable drawable, int i, String str, String str2, String str3, String str4, Integer num, DialogInterface.OnClickListener onClickListener, Boolean bool, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, int i2, Object obj) {
            int i3 = i2;
            return companion.showConfirmTextDialog(context, (i3 & 2) != 0 ? null : drawable, (i3 & 4) != 0 ? -1 : i, str, str2, str3, str4, (i3 & 128) != 0 ? 0 : num, onClickListener, (i3 & 512) != 0 ? Boolean.TRUE : bool, (i3 & 1024) != 0 ? null : onClickListener2, (i3 & 2048) != 0 ? null : onDismissListener);
        }

        public static /* synthetic */ void showCreateFinderUserDialog$default(Companion companion, Context context, int i, Intent intent, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                intent = null;
            }
            companion.showCreateFinderUserDialog(context, i, intent);
        }

        public static /* synthetic */ void showCreateFinderUserDialogOnLiveWithCallback$default(Companion companion, Activity activity, int i, Intent intent, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, int i3, Object obj) {
            companion.showCreateFinderUserDialogOnLiveWithCallback(activity, i, (i3 & 4) != 0 ? null : intent, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : onClickListener, (i3 & 32) != 0 ? null : onClickListener2, (i3 & 64) != 0 ? null : onDismissListener);
        }

        public static /* synthetic */ void showRealNameCertificationDialogWithCallback$default(Companion companion, Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, int i, Object obj) {
            if ((i & 2) != 0) {
                onClickListener = null;
            }
            if ((i & 4) != 0) {
                onClickListener2 = null;
            }
            if ((i & 8) != 0) {
                onDismissListener = null;
            }
            companion.showRealNameCertificationDialogWithCallback(activity, onClickListener, onClickListener2, onDismissListener);
        }

        public static /* synthetic */ void showUserInfoConfirmDialog$default(Companion companion, Context context, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, boolean z, int i, Object obj) {
            if ((i & 16) != 0) {
                onDismissListener = null;
            }
            companion.showUserInfoConfirmDialog(context, str, onClickListener, onClickListener2, onDismissListener, (i & 32) != 0 ? false : z);
        }

        public final C77407n showConfirmDialog(Context context, Drawable drawable, int i, String str, View view, String str2, String str3, Integer num, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, boolean z) {
            RoundedCornerFrameLayout roundedCornerFrameLayout;
            Context context2 = context;
            Drawable drawable2 = drawable;
            int i2 = i;
            View view2 = view;
            boolean z2 = z;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(view, "content");
            C77407n nVar = new C77407n(context, 1, false);
            nVar.mo107570o(z2);
            if (z2) {
                View inflate = View.inflate(context, C0966R.C0971layout.coh, (ViewGroup) null);
                C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
                roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
            } else {
                View inflate2 = View.inflate(context, C0966R.C0971layout.a9d, (ViewGroup) null);
                C87412m.m108592e(inflate2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
                roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate2;
            }
            ((FrameLayout) roundedCornerFrameLayout.findViewById(C0966R.C0970id.f358060d81)).addView(view);
            WeImageView weImageView = (WeImageView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.d_n);
            if (drawable2 != null) {
                weImageView.setImageDrawable(drawable);
            } else {
                weImageView.setImageDrawable(C76577a.m92158i(context, C0966R.raw.icons_outlined_finder_icon));
            }
            if (i2 != -1) {
                weImageView.setIconColor(i);
            } else {
                weImageView.setIconColor(C76577a.m92153d(context, C0966R.color.f2960ag));
            }
            TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.e8e);
            if (!Util.isNullOrNil(str)) {
                String str4 = str;
                textView.setText(str);
            }
            Button button = (Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.hll);
            if (!Util.isNullOrNil(str2)) {
                String str5 = str2;
                button.setText(str2);
            }
            Button button2 = (Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.apy);
            if (!Util.isNullOrNil(str3)) {
                button2.setText(str3);
            }
            C87412m.m108593f(button, "okBtn");
            C7919x.m8091a(button);
            C87412m.m108593f(button2, "cancelBtn");
            C7919x.m8091a(button2);
            roundedCornerFrameLayout.mo153905b((float) C74942w4.m89784a(context, 12), (float) C74942w4.m89784a(context, 12), 0.0f, 0.0f);
            button.setOnClickListener(new FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1(nVar, onClickListener));
            button2.setOnClickListener(new FinderBottomCustomDialogHelper$Companion$showConfirmDialog$2(nVar, onClickListener2));
            nVar.f225761d = new FinderBottomCustomDialogHelper$Companion$showConfirmDialog$3(onDismissListener);
            nVar.f225771i = new FinderBottomCustomDialogHelper$Companion$showConfirmDialog$4(nVar, roundedCornerFrameLayout);
            if (num != null && num.intValue() == 1) {
                button.setTextColor(context.getResources().getColor(C0966R.color.alc));
                button.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.a1b));
            }
            nVar.mo107559d(true);
            nVar.mo107573q();
            return nVar;
        }

        public final C77407n showConfirmMsgDialog(Context context, Drawable drawable, int i, String str, String str2, String str3, String str4, Integer num, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener) {
            Context context2 = context;
            C87412m.m108594g(context2, "context");
            C87412m.m108594g(str2, "msg");
            View inflate = View.inflate(context2, C0966R.C0971layout.a9b, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.e3g)).setText(Util.nullAsNil(str2));
            return showConfirmDialog$default(this, context2, drawable, i, str, inflate, str3, str4, num, onClickListener, onClickListener2, onDismissListener, false, 2048, (Object) null);
        }

        public final C77407n showConfirmTextDialog(Context context, Drawable drawable, int i, String str, String str2, String str3, String str4, Integer num, DialogInterface.OnClickListener onClickListener, Boolean bool, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener) {
            Context context2 = context;
            Drawable drawable2 = drawable;
            int i2 = i;
            String str5 = str2;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str2, "content");
            C77407n nVar = new C77407n(context, 1, false);
            View inflate = View.inflate(context, C0966R.C0971layout.a9e, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
            ((TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.f358060d81)).setText(str2);
            WeImageView weImageView = (WeImageView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.d_n);
            if (drawable2 != null) {
                weImageView.setImageDrawable(drawable);
            } else {
                weImageView.setImageDrawable(C76577a.m92158i(context, C0966R.raw.icons_outlined_finder_icon));
            }
            if (i2 != -1) {
                weImageView.setIconColor(i);
            } else {
                weImageView.setIconColor(C76577a.m92153d(context, C0966R.color.f2960ag));
            }
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                weImageView.setVisibility(0);
            } else {
                weImageView.setVisibility(8);
            }
            TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.e8e);
            if (!Util.isNullOrNil(str)) {
                String str6 = str;
                textView.setText(str);
            }
            Button button = (Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.hll);
            if (!Util.isNullOrNil(str3)) {
                String str7 = str3;
                button.setText(str3);
            }
            Button button2 = (Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.apy);
            if (!Util.isNullOrNil(str4)) {
                button2.setText(str4);
            }
            roundedCornerFrameLayout.mo153905b((float) C74942w4.m89784a(context, 12), (float) C74942w4.m89784a(context, 12), 0.0f, 0.0f);
            button.setOnClickListener(new FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$1(nVar, onClickListener));
            button2.setOnClickListener(new FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$2(nVar, onClickListener2));
            nVar.f225761d = new FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$3(onDismissListener);
            nVar.f225771i = new FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$4(nVar, roundedCornerFrameLayout);
            if (num != null && num.intValue() == 1) {
                button.setTextColor(context.getResources().getColor(C0966R.color.alc));
                button.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.a1b));
                button2.setTextColor(context.getResources().getColor(C0966R.color.a_j));
            }
            nVar.mo107559d(true);
            nVar.mo107573q();
            return nVar;
        }

        public final void showCreateFinderUserDialog(Context context, int i, Intent intent) {
            C87412m.m108594g(context, "context");
            String string = context.getString(C0966R.string.d5p);
            C87412m.m108593f(string, "context.getString(R.stri…nder_create_finder_title)");
            String string2 = context.getString(C0966R.string.d5m);
            C87412m.m108593f(string2, "context.getString(R.stri…finder_create_finder_msg)");
            String string3 = context.getString(C0966R.string.d5o);
            C87412m.m108593f(string3, "context.getString(R.stri…_create_finder_ok_button)");
            String string4 = context.getString(C0966R.string.d5l);
            C87412m.m108593f(string4, "context.getString(R.stri…ate_finder_cancel_button)");
            showConfirmMsgDialog$default(this, context, (Drawable) null, 0, string, string2, string3, string4, (Integer) null, new C3922x2cc06e03(intent, i, context), (DialogInterface.OnClickListener) null, C3923x2cc06e04.INSTANCE, C90004e.CTRL_INDEX, (Object) null);
        }

        public final void showCreateFinderUserDialogOnLiveWithCallback(Activity activity, int i, Intent intent, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener) {
            Activity activity2 = activity;
            C87412m.m108594g(activity2, "context");
            String string = activity2.getString(C0966R.string.f360490d63);
            C87412m.m108593f(string, "context.getString(R.string.finder_create_title)");
            String string2 = activity2.getString(C0966R.string.d5i);
            C87412m.m108593f(string2, "context.getString(R.stri…nder_create_contact_tips)");
            String string3 = activity2.getString(C0966R.string.dcg);
            C87412m.m108593f(string3, "context.getString(R.stri…to_create_finder_account)");
            String string4 = activity2.getString(C0966R.string.d5l);
            C87412m.m108593f(string4, "context.getString(R.stri…ate_finder_cancel_button)");
            showConfirmMsgDialog$default(this, activity, (Drawable) null, 0, string, string2, string3, string4, 1, new C3924x60dc8159(intent, i, activity, i2, onClickListener), onClickListener2, onDismissListener, 6, (Object) null);
        }

        public final void showOverSeaAgreeConfirmDiaglog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
            Context context2 = context;
            String str3 = str;
            String str4 = str2;
            Class cls = C76979h.class;
            C87412m.m108594g(context2, "context");
            C87412m.m108594g(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str4, "content");
            C77407n nVar = new C77407n(context2, 1, false);
            View inflate = View.inflate(context2, C0966R.C0971layout.a9f, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.mo153905b((float) C74942w4.m89784a(context2, 12), (float) C74942w4.m89784a(context2, 12), 0.0f, 0.0f);
            ((TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.e8e)).setText(str3);
            ((TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.f358060d81)).setText(str4);
            TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.lu9);
            TextView textView2 = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.lu7);
            String str5 = "";
            String obj = C86709a0.m107535s().mo121142i().mo119684e(274436, str5).toString();
            if (Util.isNullOrNil(obj)) {
                obj = LocaleUtil.getCurrentCountryCode();
            }
            if (Util.isNullOrNil(obj) || Util.isAllAlpha(obj)) {
                str5 = obj;
            }
            String string = context.getResources().getString(C0966R.string.g5g, new Object[]{LocaleUtil.getApplicationLanguage(), str5, "setting", 0, 0});
            C87412m.m108593f(string, "context.resources.getStr…tryCode, \"setting\", 0, 0)");
            String string2 = context.getResources().getString(C0966R.string.f361485k83, new Object[]{LocaleUtil.getApplicationLanguage(), str5});
            C87412m.m108593f(string2, "context.resources.getStr…nLanguage(), countryCode)");
            String format = String.format("<a href='%s'>%s</a>", Arrays.copyOf(new Object[]{string2, context.getResources().getString(C0966R.string.g5a)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            textView.setText(format);
            String format2 = String.format("<a href='%s'>%s</a>", Arrays.copyOf(new Object[]{string, context.getResources().getString(C0966R.string.hmo)}, 2));
            C87412m.m108593f(format2, "format(format, *args)");
            textView2.setText(format2);
            ((C76979h) C86312j.m106911c(cls)).mo107079pD(textView, 1);
            ((C76979h) C86312j.m106911c(cls)).mo107079pD(textView2, 1);
            ((Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.hll)).setOnClickListener(new C3925x4819dd78(nVar, onClickListener));
            ((Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.apy)).setOnClickListener(new C3926x4819dd79(nVar));
            nVar.f225771i = new C3927x4819dd7a(nVar, roundedCornerFrameLayout);
            nVar.mo107559d(true);
            nVar.mo107573q();
        }

        public final void showRealNameCertificationDialog(Activity activity) {
            C87412m.m108594g(activity, "context");
            Drawable i = C76577a.m92158i(activity, C0966R.raw.icons_outlined_wechat);
            int d = C76577a.m92153d(activity, C0966R.color.ahf);
            String string = activity.getString(C0966R.string.f360767em1);
            C87412m.m108593f(string, "context.getString(R.string.finder_real_name_title)");
            String string2 = activity.getString(C0966R.string.elo);
            C87412m.m108593f(string2, "context.getString(R.string.finder_real_name_msg)");
            String string3 = activity.getString(C0966R.string.elp);
            C87412m.m108593f(string3, "context.getString(R.stri…nder_real_name_ok_button)");
            String string4 = activity.getString(C0966R.string.eln);
            C87412m.m108593f(string4, "context.getString(R.stri…_real_name_cancel_button)");
            showConfirmMsgDialog$default(this, activity, i, d, string, string2, string3, string4, (Integer) null, new C3928x26de1a5(activity), (DialogInterface.OnClickListener) null, C3929x26de1a6.INSTANCE, 640, (Object) null);
        }

        public final void showRealNameCertificationDialogWithCallback(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener) {
            C87412m.m108594g(activity, "context");
            Drawable i = C76577a.m92158i(activity, C0966R.raw.icons_outlined_finder_icon);
            int d = C76577a.m92153d(activity, C0966R.color.f2960ag);
            String string = activity.getString(C0966R.string.f360490d63);
            C87412m.m108593f(string, "context.getString(R.string.finder_create_title)");
            String string2 = activity.getString(C0966R.string.d56);
            C87412m.m108593f(string2, "context.getString(R.stri…out_need_real_name_title)");
            String string3 = activity.getString(C0966R.string.elp);
            C87412m.m108593f(string3, "context.getString(R.stri…nder_real_name_ok_button)");
            String string4 = activity.getString(C0966R.string.eln);
            C87412m.m108593f(string4, "context.getString(R.stri…_real_name_cancel_button)");
            DialogInterface.OnClickListener onClickListener3 = onClickListener;
            showConfirmMsgDialog(activity, i, d, string, string2, string3, string4, 1, new C3930xbd5eba30(activity, onClickListener), onClickListener2, onDismissListener);
        }

        public final void showUserInfoConfirmDialog(Context context, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, boolean z) {
            Context context2 = context;
            String str2 = str;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, "finderUserName");
            String string = context.getString(C0966R.string.eth);
            C87412m.m108593f(string, "context.getString(com.te…_user_info_confirm_title)");
            String string2 = context.getString(C0966R.string.etj);
            C87412m.m108593f(string2, "context.getString(com.te…nder_user_info_ok_button)");
            String string3 = context.getString(C0966R.string.etg);
            C87412m.m108593f(string3, "context.getString(com.te…_user_info_cancel_button)");
            View inflate = z ? View.inflate(context, C0966R.C0971layout.cog, (ViewGroup) null) : View.inflate(context, C0966R.C0971layout.a9c, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            new UserInfoHelper(context, str, (ViewGroup) inflate).load(new C3931x8626e028(context, string, inflate, string2, string3, onClickListener, onClickListener2, z, onDismissListener));
        }

        public final void showUserInfoConfirmDialogOnLiveRedPacket(Context context, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, "finderUserName");
            String string = context.getString(C0966R.string.eth);
            C87412m.m108593f(string, "context.getString(com.te…_user_info_confirm_title)");
            String string2 = context.getString(C0966R.string.etj);
            C87412m.m108593f(string2, "context.getString(com.te…nder_user_info_ok_button)");
            String string3 = context.getString(C0966R.string.etg);
            C87412m.m108593f(string3, "context.getString(com.te…_user_info_cancel_button)");
            View inflate = View.inflate(context, C0966R.C0971layout.a9c, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            new UserInfoHelper(context, str, (ViewGroup) inflate).load(new C3933x7ee1bbfa(context, string, inflate, string2, string3, onClickListener, onClickListener2));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J,\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010#\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00040 R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00040 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u00103¨\u00067"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$UserInfoHelper;", "Lob0/n;", "", "username", "Lrx3/b0;", "doSceneForUserInfo", "loadInternal", "Lfe1/q;", "finderContact", "Landroid/view/ViewGroup;", "userInfoContainer", "handleNickname", "handleAuth", "locationText", "", "getLocationTextWidth", "text", "", "availableWidth", "nameExtWidth", "setProfileTextWidth", "getChangeLeftRegionWidth", "getTotalAvailableWidth", "Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$b;", "userExtInfo", "getUserTagText", "errType", "errCode", "errMsg", "Lob0/y;", "scene", "onSceneEnd", "Lkotlin/Function1;", "", "callback", "load", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "Lqo3/i0;", "loadingDialog", "Lqo3/i0;", "Llu3/c;", "dialogRunnable", "Llu3/c;", "Lfy3/l;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/view/ViewGroup;)V", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper */
    public static final class UserInfoHelper implements C11385n {
        public static final Companion Companion = new Companion((C8480h) null);
        public static final String TAG = "ProfileHeaderHelper";
        /* access modifiers changed from: private */
        public static final C101614i<String, FinderProfileHeaderUIC.C3463b> userExtInfoCache = new C101614i<>(100);
        private C32226l<? super Boolean, C13598b0> callback = FinderBottomCustomDialogHelper$UserInfoHelper$callback$1.INSTANCE;
        private final Context context;
        private C34379c<?> dialogRunnable;
        /* access modifiers changed from: private */
        public C89779i0 loadingDialog;
        private final ViewGroup userInfoContainer;
        private final String username;

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00038\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$UserInfoHelper$Companion;", "", "Lsg/i;", "", "Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$b;", "userExtInfoCache", "Lsg/i;", "getUserExtInfoCache", "()Lsg/i;", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }

            public final C101614i<String, FinderProfileHeaderUIC.C3463b> getUserExtInfoCache() {
                return UserInfoHelper.userExtInfoCache;
            }
        }

        public UserInfoHelper(Context context2, String str, ViewGroup viewGroup) {
            C87412m.m108594g(context2, "context");
            C87412m.m108594g(str, "username");
            C87412m.m108594g(viewGroup, "userInfoContainer");
            this.context = context2;
            this.username = str;
            this.userInfoContainer = viewGroup;
        }

        private final void doSceneForUserInfo(String str) {
            Log.m105924i(TAG, "doSceneForUserInfo, username:" + str);
            C34379c<?> cVar = this.dialogRunnable;
            if (cVar != null) {
                cVar.cancel(false);
            }
            C119179t tVar = C119157j.f356862d;
            C3935x2de5cc7f finderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$1 = new C3935x2de5cc7f(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            this.dialogRunnable = jVar.mo183892w(finderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$1, 1500, false);
            C86709a0.m107524d().mo123455a(3736, this);
            C89137b0 d = C86709a0.m107524d();
            C9377s4 s4Var = r3;
            C9377s4 s4Var2 = new C9377s4(str, 0, (C89349b) null, 0, (C49712hj1) null, 0, 0, false, (String) null, 0, (Integer) null, (Long) null, (String) null, false, false, (Long) null, 65518, (C8480h) null);
            s4Var.f29279i = true;
            d.mo123460f(s4Var);
        }

        private final float getChangeLeftRegionWidth(String str) {
            if (this.userInfoContainer.findViewById(C0966R.C0970id.e4w).getVisibility() == 0) {
                return 0.0f + ((float) C76577a.m92155f(this.userInfoContainer.getContext(), C0966R.dimen.f3738cr));
            }
            return 0.0f;
        }

        private final float getLocationTextWidth(String str) {
            if (!Util.isNullOrNil(str)) {
                return ((TextView) this.userInfoContainer.findViewById(C0966R.C0970id.l2k)).getPaint().measureText(str);
            }
            return 0.0f;
        }

        private final int getTotalAvailableWidth() {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Context context2 = this.userInfoContainer.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context2).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            Log.m105924i(TAG, "screen width :" + displayMetrics.widthPixels);
            return displayMetrics.widthPixels - C76577a.m92155f(this.userInfoContainer.getContext(), C0966R.dimen.a6b);
        }

        private final String getUserTagText(FinderProfileHeaderUIC.C3463b bVar) {
            LinkedList<String> linkedList = bVar.f16264c;
            if (!linkedList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String append : linkedList) {
                    sb.append(append);
                    sb.append(" ");
                }
                SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.context, sb.toString());
                if (T1 != null) {
                    String spannableString = T1.toString();
                    C87412m.m108593f(spannableString, "this.toString()");
                    return spannableString;
                }
            }
            return "";
        }

        private final void handleAuth(C58969q qVar) {
            FinderAuthInfo finderAuthInfo = qVar != null ? qVar.field_authInfo : null;
            boolean z = false;
            if (finderAuthInfo == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("[handleAuthGenerator] profileContact=");
                if (qVar != null) {
                    z = true;
                }
                sb.append(z);
                Log.m105928w("Finder.FinderProfileHeaderUIC", sb.toString());
            } else if (finderAuthInfo.authIconType <= 0) {
                Log.m105928w("Finder.FinderProfileHeaderUIC", "[handleAuthGenerator] authIconType<=0");
            } else {
                C58784w3 w3Var = C58784w3.f168295a;
                View findViewById = this.userInfoContainer.findViewById(C0966R.C0970id.e4w);
                C87412m.m108593f(findViewById, "userInfoContainer.findVi…finder_profile_auth_icon)");
                C58784w3.m68429F1(w3Var, (ImageView) findViewById, finderAuthInfo, 0, C58960c.m68830b(qVar, false), 4, (Object) null);
            }
        }

        private final void handleNickname(C58969q qVar, ViewGroup viewGroup) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            if (qVar != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.findViewById(C0966R.C0970id.e5y).getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.e5z);
                ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.e4x);
                if (((TextView) viewGroup.findViewById(C0966R.C0970id.l2k)).getVisibility() == 4) {
                    layoutParams2.f44453j = -1;
                    layoutParams2.f44449h = C0966R.C0970id.e4y;
                    layoutParams2.f44455k = C0966R.C0970id.e4y;
                } else {
                    layoutParams2.f44453j = C0966R.C0970id.e4z;
                    layoutParams2.f44449h = -1;
                    layoutParams2.f44455k = -1;
                }
                viewGroup.findViewById(C0966R.C0970id.e5y).setLayoutParams(layoutParams2);
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
                C62345f fVar = new C62345f(qVar.field_avatarUrl, (C27696y) null, 2, (C8480h) null);
                C87412m.m108593f(imageView, "userAvatarIv");
                i2.mo85957c(fVar, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            }
        }

        /* access modifiers changed from: private */
        public final void loadInternal() {
            Object obj = userExtInfoCache.get(this.username);
            C87412m.m108593f(obj, "userExtInfoCache[username]");
            String userTagText = getUserTagText((FinderProfileHeaderUIC.C3463b) obj);
            C58969q b = C58961d.f168673a.mo84155b(this.username);
            String spannableString = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.context, b != null ? b.getNickname() : null).toString();
            C87412m.m108593f(spannableString, "getService(ISpannableSer…act?.nickname).toString()");
            int totalAvailableWidth = getTotalAvailableWidth();
            float changeLeftRegionWidth = getChangeLeftRegionWidth(spannableString);
            float measureText = ((TextView) this.userInfoContainer.findViewById(C0966R.C0970id.e5z)).getPaint().measureText(spannableString);
            float locationTextWidth = getLocationTextWidth(userTagText);
            float f = (float) totalAvailableWidth;
            if (measureText + changeLeftRegionWidth > f || locationTextWidth > f) {
                setProfileTextWidth(spannableString, userTagText, totalAvailableWidth - C76577a.m92155f(this.userInfoContainer.getContext(), C0966R.dimen.f3736cp), (int) changeLeftRegionWidth);
            } else {
                setProfileTextWidth(spannableString, userTagText, totalAvailableWidth, (int) changeLeftRegionWidth);
            }
            handleNickname(b, this.userInfoContainer);
            handleAuth(b);
            this.callback.invoke(Boolean.TRUE);
        }

        private final void setProfileTextWidth(String str, String str2, int i, int i2) {
            ((TextView) this.userInfoContainer.findViewById(C0966R.C0970id.e5z)).setMaxWidth(i - i2);
            ((TextView) this.userInfoContainer.findViewById(C0966R.C0970id.e5z)).setText(str);
            ((TextView) this.userInfoContainer.findViewById(C0966R.C0970id.l2k)).setMaxWidth(i);
            ((TextView) this.userInfoContainer.findViewById(C0966R.C0970id.l2k)).setText(str2);
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getUsername() {
            return this.username;
        }

        public final void load(C32226l<? super Boolean, C13598b0> lVar) {
            C87412m.m108594g(lVar, "callback");
            this.callback = lVar;
            if (!userExtInfoCache.check(this.username)) {
                doSceneForUserInfo(this.username);
            } else {
                loadInternal();
            }
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C117747y yVar2 = yVar;
            C89779i0 i0Var = this.loadingDialog;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C34379c<?> cVar = this.dialogRunnable;
            if (cVar != null) {
                cVar.cancel(false);
            }
            if (i != 0 || i2 != 0) {
                this.callback.invoke(Boolean.FALSE);
            } else if (yVar2 instanceof C9377s4) {
                StringBuilder sb = new StringBuilder();
                sb.append("username=");
                sb.append(this.username);
                sb.append(", scene username=");
                C9377s4 s4Var = (C9377s4) yVar2;
                FinderContact P0 = s4Var.mo10101P0();
                sb.append(P0 != null ? P0.username : null);
                Log.m105924i(TAG, sb.toString());
                C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = userExtInfoCache;
                FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) iVar.get(this.username);
                if (bVar == null) {
                    bVar = new FinderProfileHeaderUIC.C3463b(0, 0, (LinkedList) null, (C49098d51) null, (C50019jp1) null, (C51691vg0) null, (C52271zj0) null, (C0264h) null, (C50428mo1) null, (C49316ep1) null, (C49236e51) null, (List) null, (C51869ws0) null, (C51583uq0) null, (C51810wb1) null, (C51583uq0) null, 65535, (C8480h) null);
                }
                bVar.f16263b = s4Var.f29289v;
                bVar.f16262a = s4Var.f29288u;
                bVar.f16264c = new LinkedList<>(s4Var.f29287t);
                C47465a aVar = s4Var.f29282o.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
                bVar.f16266e = ((FinderUserPageResponse) aVar).wxaShopInfo;
                C47465a aVar2 = s4Var.f29282o.f127056b.f127083a;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
                LinkedList<FinderJumpInfo> linkedList = ((FinderUserPageResponse) aVar2).jump_info;
                C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…erPageResponse).jump_info");
                bVar.f16273l = linkedList;
                iVar.put(this.username, bVar);
                new MMHandler(Looper.getMainLooper()).postUI(new FinderBottomCustomDialogHelper$UserInfoHelper$onSceneEnd$1(this));
            }
            C86709a0.m107524d().mo123470p(3736, this);
        }
    }
}
