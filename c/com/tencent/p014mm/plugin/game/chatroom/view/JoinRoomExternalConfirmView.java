package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import dx1.C45490g;
import kotlin.Metadata;
import p192l4.C10462b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "game-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView */
public final class JoinRoomExternalConfirmView extends LinearLayout {

    /* renamed from: d */
    public long f112588d;

    /* renamed from: e */
    public long f112589e;

    /* renamed from: f */
    public C45490g f112590f;

    public JoinRoomExternalConfirmView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359838ck0, this, false);
        addView(inflate);
        int i2 = C0966R.C0970id.f357755lw1;
        FixAspectRatioAndTopCropImageView fixAspectRatioAndTopCropImageView = (FixAspectRatioAndTopCropImageView) C10462b.m10395a(inflate, C0966R.C0970id.f357755lw1);
        if (fixAspectRatioAndTopCropImageView != null) {
            i2 = C0966R.C0970id.bl6;
            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.bl6);
            if (textView != null) {
                i2 = C0966R.C0970id.f357758lw2;
                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f357758lw2);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    i2 = C0966R.C0970id.lw_;
                    Button button = (Button) C10462b.m10395a(inflate, C0966R.C0970id.lw_);
                    if (button != null) {
                        i2 = C0966R.C0970id.lwc;
                        TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.lwc);
                        if (textView3 != null) {
                            i2 = C0966R.C0970id.f359467lx0;
                            MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) C10462b.m10395a(inflate, C0966R.C0970id.f359467lx0);
                            if (mMRoundCornerImageView != null) {
                                this.f112590f = new C45490g(constraintLayout, fixAspectRatioAndTopCropImageView, textView, textView2, constraintLayout, button, textView3, mMRoundCornerImageView);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public JoinRoomExternalConfirmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
