package com.tencent.p014mm.plugin.game.luggage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.C74942w4;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/GameRoundContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.luggage.GameRoundContainerView */
public final class GameRoundContainerView extends FrameLayout {

    /* renamed from: d */
    public int f198329d;

    /* renamed from: e */
    public Path f198330e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GameRoundContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        this.f198329d = C74942w4.m89784a(context, 12);
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        Path path = this.f198330e;
        if (path != null) {
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            return;
        }
        C87412m.m108603p("path");
        throw null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = new Path();
        this.f198330e = path;
        int i5 = this.f198329d;
        path.addArc(0.0f, 0.0f, ((float) i5) * 2.0f, ((float) i5) * 2.0f, 180.0f, 90.0f);
        Path path2 = this.f198330e;
        if (path2 != null) {
            float f = (float) i;
            path2.lineTo(f - ((float) this.f198329d), 0.0f);
            Path path3 = this.f198330e;
            if (path3 != null) {
                int i6 = this.f198329d;
                path3.addArc(f - (((float) i6) * 2.0f), 0.0f, f, ((float) i6) * 2.0f, 270.0f, 90.0f);
                Path path4 = this.f198330e;
                if (path4 != null) {
                    float f2 = (float) i2;
                    path4.lineTo(f, f2);
                    Path path5 = this.f198330e;
                    if (path5 != null) {
                        path5.lineTo(0.0f, f2);
                        Path path6 = this.f198330e;
                        if (path6 != null) {
                            path6.lineTo(0.0f, (float) this.f198329d);
                        } else {
                            C87412m.m108603p("path");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("path");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("path");
                    throw null;
                }
            } else {
                C87412m.m108603p("path");
                throw null;
            }
        } else {
            C87412m.m108603p("path");
            throw null;
        }
    }
}
