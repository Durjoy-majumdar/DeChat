package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import p270xi.C78834c;
import p270xi.C78838j;

/* renamed from: com.tencent.mm.ui.chatting.component.f1 */
public class C73472f1 extends C78834c implements C78838j {

    /* renamed from: d */
    public HashSet<C78834c> f215885d = new HashSet<>();

    /* renamed from: H3 */
    public void mo102426H3(C78834c cVar) {
        if (!this.f215885d.contains(cVar)) {
            this.f215885d.add(cVar);
        }
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo70052N5(i, i2, intent);
        }
    }

    /* renamed from: O5 */
    public void mo102427O5() {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo102427O5();
        }
    }

    /* renamed from: P5 */
    public void mo102428P5() {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo102428P5();
        }
    }

    /* renamed from: Q5 */
    public void mo102429Q5() {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo102429Q5();
        }
    }

    /* renamed from: R5 */
    public void mo70146R5(Configuration configuration) {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo70146R5(configuration);
        }
    }

    /* renamed from: S5 */
    public void mo102430S5() {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo102430S5();
        }
    }

    /* renamed from: T5 */
    public void mo102365T5() {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo102365T5();
        }
    }

    /* renamed from: U5 */
    public boolean mo70055U5(int i, KeyEvent keyEvent) {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            if (it.next().mo70055U5(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V5 */
    public void mo102183V5(int i, String[] strArr, int[] iArr) {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo102183V5(i, strArr, iArr);
        }
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo26189W5(view, i, i2, i3);
        }
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
        Iterator<C78834c> it = this.f215885d.iterator();
        while (it.hasNext()) {
            it.next().mo102328X5(view, i);
        }
    }

    /* renamed from: u1 */
    public void mo102431u1(C78834c cVar) {
        this.f215885d.remove(cVar);
    }
}
