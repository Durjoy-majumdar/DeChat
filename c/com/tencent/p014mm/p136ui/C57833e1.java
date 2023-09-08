package com.tencent.p014mm.p136ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import b60.C54426a;
import b60.C54427b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import p196ln.C76705f;
import p629ny.C76979h;
import p744wt.C66190c;

/* renamed from: com.tencent.mm.ui.e1 */
public class C57833e1 {

    /* renamed from: d */
    public static HashSet<C57835b> f165458d = new HashSet<>();

    /* renamed from: a */
    public String f165459a;

    /* renamed from: b */
    public LinkedList<C54426a> f165460b;

    /* renamed from: c */
    public C54427b.C28258a f165461c = new C57834a();

    /* renamed from: com.tencent.mm.ui.e1$a */
    public class C57834a implements C54427b.C28258a {
        public C57834a() {
        }

        /* renamed from: a */
        public void mo82259a(String str) {
            String str2 = C57833e1.this.f165459a;
            if (str2 != null && str2.equals(str)) {
                Log.m105925i("MicroMsg.LiveTalkRoomTipsBarController", "liveTipsBarStorage notify, hostRoomId:%s", C57833e1.this.f165459a);
                C57833e1 e1Var = C57833e1.this;
                e1Var.getClass();
                e1Var.f165460b = ((C66190c) C86312j.m106911c(C66190c.class)).o40().mo55887Q(e1Var.f165459a);
                HashSet<C57835b> hashSet = C57833e1.f165458d;
                if (hashSet != null) {
                    Iterator<C57835b> it = hashSet.iterator();
                    while (it.hasNext()) {
                        MMHandlerThread.postToMainThread(new C57838f1(it.next(), str));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.e1$b */
    public interface C57835b {
        /* renamed from: t3 */
        void mo82260t3(String str);
    }

    /* renamed from: com.tencent.mm.ui.e1$c */
    public class C57836c extends BaseAdapter {
        public C57836c() {
        }

        public int getCount() {
            LinkedList<C54426a> linkedList = C57833e1.this.f165460b;
            if (linkedList != null) {
                return linkedList.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            LinkedList<C54426a> linkedList = C57833e1.this.f165460b;
            if (linkedList == null) {
                return null;
            }
            return linkedList.get(i);
        }

        public long getItemId(int i) {
            return -1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view != null) {
                C57837d dVar = (C57837d) view.getTag();
                LinkedList<C54426a> linkedList = C57833e1.this.f165460b;
                C54426a aVar = linkedList == null ? null : linkedList.get(i);
                if (aVar == null) {
                    dVar.getClass();
                    throw null;
                }
                dVar.getClass();
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) null, aVar.mo55882Y1());
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                C57833e1.this.getClass();
                throw null;
            }
            C57833e1.this.getClass();
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.ui.e1$d */
    public class C57837d {
    }

    public C57833e1() {
        new C57836c();
    }
}
