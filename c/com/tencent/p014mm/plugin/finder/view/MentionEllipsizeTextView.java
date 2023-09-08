package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.qqmusic.mediaplayer.util.BytesTransUtil;
import di3.C86312j;
import er1.C58784w3;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;
import p629ny.C76979h;
import p749xh.C66276va;
import pe3.C89349b;
import sx3.C64192l;
import te3.C64829xh0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/MentionEllipsizeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lxh/va;", "finderMention", "Lrx3/b0;", "setMention", "g", "Lxh/va;", "getFinderMention", "()Lxh/va;", "setFinderMention", "(Lxh/va;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.MentionEllipsizeTextView */
public final class MentionEllipsizeTextView extends AppCompatTextView {

    /* renamed from: g */
    public C66276va f162155g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MentionEllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final C66276va getFinderMention() {
        return this.f162155g;
    }

    public void onMeasure(int i, int i2) {
        C41598v7 v7Var;
        super.onMeasure(i, i2);
        C66276va vaVar = this.f162155g;
        Layout layout = getLayout();
        if (vaVar != null && layout != null && vaVar.field_commentMentionedUser != null && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            C58784w3 w3Var = C58784w3.f168295a;
            C64829xh0 xh02 = vaVar.field_commentMentionedUser;
            C87412m.m108593f(xh02, "finderMention.field_commentMentionedUser");
            w3Var.getClass();
            C89349b bVar = xh02.f186300d;
            if (bVar == null || bVar.f257327a.length != 16) {
                v7Var = null;
            } else {
                C87412m.m108591d(bVar);
                byte[] bArr = bVar.f257327a;
                C87412m.m108593f(bArr, "byteArr");
                C64192l.m75528a(8, bArr.length);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 8);
                C87412m.m108593f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
                long j = BytesTransUtil.getInstance().getLong(copyOfRange, false);
                C64192l.m75528a(16, bArr.length);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 8, 16);
                C87412m.m108593f(copyOfRange2, "copyOfRange(this, fromIndex, toIndex)");
                v7Var = new C41598v7("", "", j, BytesTransUtil.getInstance().getLong(copyOfRange2, false));
            }
            if (v7Var != null) {
                String str = vaVar.field_content;
                long j2 = v7Var.f111968c;
                if (j2 != 0 && j2 < ((long) str.length())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(8230);
                    sb.append(str.subSequence((int) v7Var.f111968c, str.length()));
                    str = sb.toString();
                }
                setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), str));
                super.onMeasure(i, i2);
            }
        }
    }

    public final void setFinderMention(C66276va vaVar) {
        this.f162155g = vaVar;
    }

    public final void setMention(C66276va vaVar) {
        this.f162155g = vaVar;
        if (vaVar != null) {
            setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), getContext().getString(C0966R.string.d3w, new Object[]{vaVar.field_content})));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MentionEllipsizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
