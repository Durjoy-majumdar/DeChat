package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView */
public class GameDetailAutoScrollView extends LinearLayout {

    /* renamed from: d */
    public ArrayList<String> f113720d = new ArrayList<>();

    /* renamed from: e */
    public int f113721e = 0;

    /* renamed from: f */
    public ViewGroup f113722f;

    /* renamed from: g */
    public TextView f113723g;

    /* renamed from: h */
    public TextView f113724h;

    /* renamed from: i */
    public ViewGroup f113725i;

    /* renamed from: j */
    public TextView f113726j;

    /* renamed from: n */
    public TextView f113727n;

    /* renamed from: o */
    public Animation f113728o;

    /* renamed from: p */
    public Animation f113729p;

    /* renamed from: q */
    public MTimerHandler f113730q = new MTimerHandler(new C42165a(), true);

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView$a */
    public class C42165a implements MTimerHandler.CallBack {
        public C42165a() {
        }

        public boolean onTimerExpired() {
            GameDetailAutoScrollView gameDetailAutoScrollView = GameDetailAutoScrollView.this;
            if (gameDetailAutoScrollView.f113721e < (gameDetailAutoScrollView.f113720d.size() / 2) - 1) {
                gameDetailAutoScrollView.f113721e++;
            } else {
                gameDetailAutoScrollView.f113721e = 0;
            }
            gameDetailAutoScrollView.f113726j.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(gameDetailAutoScrollView.getContext(), gameDetailAutoScrollView.f113720d.get(gameDetailAutoScrollView.f113721e * 2), gameDetailAutoScrollView.f113726j.getTextSize()));
            gameDetailAutoScrollView.f113727n.setText(gameDetailAutoScrollView.f113720d.get((gameDetailAutoScrollView.f113721e * 2) + 1));
            gameDetailAutoScrollView.f113722f.startAnimation(gameDetailAutoScrollView.f113729p);
            gameDetailAutoScrollView.f113722f.setVisibility(8);
            gameDetailAutoScrollView.f113725i.startAnimation(gameDetailAutoScrollView.f113728o);
            gameDetailAutoScrollView.f113725i.setVisibility(0);
            ViewGroup viewGroup = gameDetailAutoScrollView.f113722f;
            gameDetailAutoScrollView.f113722f = gameDetailAutoScrollView.f113725i;
            gameDetailAutoScrollView.f113725i = viewGroup;
            TextView textView = gameDetailAutoScrollView.f113723g;
            gameDetailAutoScrollView.f113723g = gameDetailAutoScrollView.f113726j;
            gameDetailAutoScrollView.f113726j = textView;
            TextView textView2 = gameDetailAutoScrollView.f113724h;
            gameDetailAutoScrollView.f113724h = gameDetailAutoScrollView.f113727n;
            gameDetailAutoScrollView.f113727n = textView2;
            return true;
        }
    }

    public GameDetailAutoScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0966R.C0971layout.avk, this, false);
        this.f113722f = viewGroup;
        this.f113723g = (TextView) viewGroup.findViewById(C0966R.C0970id.eir);
        this.f113724h = (TextView) this.f113722f.findViewById(C0966R.C0970id.eit);
        addView(this.f113722f);
        this.f113722f.setVisibility(8);
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(C0966R.C0971layout.avk, this, false);
        this.f113725i = viewGroup2;
        this.f113726j = (TextView) viewGroup2.findViewById(C0966R.C0970id.eir);
        this.f113727n = (TextView) this.f113725i.findViewById(C0966R.C0970id.eit);
        addView(this.f113725i);
        this.f113725i.setVisibility(8);
        this.f113728o = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2495ej);
        this.f113729p = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2509ex);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f113730q.stopTimer();
    }

    public void setText(List<String> list) {
        this.f113720d.clear();
        this.f113730q.stopTimer();
        if (list == null || list.size() == 0 || list.size() % 2 != 0) {
            this.f113722f.setVisibility(8);
            this.f113725i.setVisibility(8);
            return;
        }
        this.f113720d.addAll(list);
        this.f113721e = 0;
        this.f113723g.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), this.f113720d.get(0), this.f113723g.getTextSize()));
        this.f113724h.setText(this.f113720d.get(1));
        this.f113722f.setVisibility(0);
        this.f113725i.setVisibility(8);
        if (this.f113720d.size() / 2 != 1) {
            this.f113730q.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }
}
