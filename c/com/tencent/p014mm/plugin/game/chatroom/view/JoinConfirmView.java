package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/JoinConfirmView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "game-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.chatroom.view.JoinConfirmView */
public final class JoinConfirmView extends LinearLayout {

    /* renamed from: d */
    public long f19168d;

    /* renamed from: e */
    public long f19169e;

    public JoinConfirmView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        this.f19168d = activity.getIntent().getLongExtra("game_report_sourceid", 0);
        this.f19169e = activity.getIntent().getLongExtra("game_report_ssid", 0);
    }

    public JoinConfirmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
