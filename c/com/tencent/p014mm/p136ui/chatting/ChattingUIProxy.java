package com.tencent.p014mm.p136ui.chatting;

import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.IChattingUIProxy;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.ChattingUIProxy */
public class ChattingUIProxy implements IChattingUIProxy {

    /* renamed from: a */
    public BaseChattingUIFragment f215337a;

    /* renamed from: b */
    public MMFragmentActivity f215338b;

    /* renamed from: c */
    public boolean f215339c = false;

    /* renamed from: d */
    public int f215340d = -1;

    public ChattingUIProxy(MMFragmentActivity mMFragmentActivity, BaseChattingUIFragment baseChattingUIFragment) {
        this.f215337a = baseChattingUIFragment;
        this.f215338b = mMFragmentActivity;
    }

    public void onEnterBegin() {
        Log.m105924i("MicroMsg.ChattingUIProxy", "[onEnterBegin]");
        BaseChattingUIFragment baseChattingUIFragment = this.f215337a;
        baseChattingUIFragment.mo70223P();
        if (baseChattingUIFragment.isCurrentActivity || baseChattingUIFragment.f215223i) {
            baseChattingUIFragment.mo101993e0();
        }
        this.f215337a.mo101993e0();
        BaseChattingUIFragment baseChattingUIFragment2 = this.f215337a;
        if (baseChattingUIFragment2.f215220f.f193283g) {
            baseChattingUIFragment2.mo102022M(4, new C73719i0(baseChattingUIFragment2));
        }
        if (this.f215340d != -1 && (this.f215338b instanceof MMActivity)) {
            this.f215337a.getController().mo177105z0(this.f215340d);
        }
    }

    public void onEnterEnd() {
        Log.m105924i("MicroMsg.ChattingUIProxy", "[onEnterEnd]");
        if (this.f215337a.mo102033d0(256)) {
            BaseChattingUIFragment baseChattingUIFragment = this.f215337a;
            if (baseChattingUIFragment.f215220f.f193283g) {
                baseChattingUIFragment.mo101992T();
                if (baseChattingUIFragment.isCurrentActivity || baseChattingUIFragment.f215223i) {
                    baseChattingUIFragment.mo102022M(256, new C73725k0(baseChattingUIFragment));
                }
            }
            BaseChattingUIFragment baseChattingUIFragment2 = this.f215337a;
            baseChattingUIFragment2.getClass();
            baseChattingUIFragment2.mo102022M(256, new C73725k0(baseChattingUIFragment2));
        }
    }

    public void onExitBegin() {
        Log.m105924i("MicroMsg.ChattingUIProxy", "[onExitBegin]");
        if (!this.f215337a.mo102032a0()) {
            this.f215337a.mo102034f0();
        }
        if (this.f215338b instanceof MMActivity) {
            this.f215340d = this.f215337a.getController().f348115o0;
        }
    }

    public void onExitEnd() {
        Log.m105924i("MicroMsg.ChattingUIProxy", "[onExitEnd]");
        this.f215337a.mo102020K();
        this.f215337a.mo102021L();
        BaseChattingUIFragment baseChattingUIFragment = this.f215337a;
        baseChattingUIFragment.getClass();
        baseChattingUIFragment.mo102022M(512, new C73716h0(baseChattingUIFragment));
        baseChattingUIFragment.mo102025Q();
        baseChattingUIFragment.mo102035g0();
        this.f215337a.mo102035g0();
    }

    public void onInit(int i, boolean z) {
        boolean z2;
        if (z) {
            C73322b4.m86462a().f215432a = 4;
        }
        this.f215339c = true;
        this.f215337a.f215223i = true;
        List<Fragment> fragments = this.f215338b.getSupportFragmentManager().getFragments();
        if (fragments == null) {
            Log.m105924i("MicroMsg.ChattingUIProxy", "fragments is null");
        } else if (fragments.size() >= 5) {
            Log.m105921e("MicroMsg.ChattingUIProxy", "fragments more than 5! %s", Integer.valueOf(fragments.size()));
            Iterator<Fragment> it = fragments.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() instanceof ChattingUIFragment) {
                        Log.m105920e("MicroMsg.ChattingUIProxy", "fragments more than 5 and find a ChattingUIFragment!!");
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            Log.m105925i("MicroMsg.ChattingUIProxy", "fragments size %s", Integer.valueOf(fragments.size()));
        }
        z2 = true;
        Log.m105925i("MicroMsg.ChattingUIProxy", "[onInit] isPreload：%s ok:%s", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z2) {
            C112919c0 beginTransaction = this.f215338b.getSupportFragmentManager().beginTransaction();
            beginTransaction.mo165167i(i, this.f215337a, (String) null, 1);
            beginTransaction.mo165163e();
            this.f215338b.getSupportFragmentManager().executePendingTransactions();
        } else {
            C112919c0 beginTransaction2 = this.f215338b.getSupportFragmentManager().beginTransaction();
            beginTransaction2.mo165200l(i, this.f215337a);
            beginTransaction2.mo165165g();
        }
        if (z) {
            onExitBegin();
            onExitEnd();
        }
        this.f215337a.f215223i = false;
    }
}
