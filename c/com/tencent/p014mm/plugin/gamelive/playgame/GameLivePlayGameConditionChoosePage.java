package com.tencent.p014mm.plugin.gamelive.playgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C9500j;
import qo3.w$$c;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.GameLivePlayGameConditionChoosePage */
public class GameLivePlayGameConditionChoosePage extends w$$c {

    /* renamed from: b */
    public View f19363b = null;

    /* renamed from: c */
    public GameLivePlayGameConditionChoosePage$$c f19364c;

    /* renamed from: d */
    public ArrayList<GameLivePlayGameConditionChoosePage$$d> f19365d = new ArrayList<>();

    /* renamed from: e */
    public int f19366e;

    public GameLivePlayGameConditionChoosePage(GameLivePlayGameConditionChoosePage$$c gameLivePlayGameConditionChoosePage$$c) {
        this.f19364c = gameLivePlayGameConditionChoosePage$$c;
    }

    /* renamed from: a */
    public View mo4781a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6411e3, (ViewGroup) null, false);
        this.f19363b = inflate;
        inflate.findViewById(C0966R.C0970id.hsj).setOnClickListener(new GameLivePlayGameConditionChoosePage$$a(this));
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new C9500j() {
            public C60896i<GameLivePlayGameConditionChoosePage$$d> getItemConvert(int i) {
                return new GameLivePlayGameConditionChoosePage$$e(GameLivePlayGameConditionChoosePage.this);
            }
        }, this.f19365d, false);
        wxRecyclerAdapter.f173488o = new GameLivePlayGameConditionChoosePage$$b(this);
        ((WxRecyclerView) this.f19363b.findViewById(C0966R.C0970id.hsk)).setAdapter(wxRecyclerAdapter);
        return this.f19363b;
    }
}
