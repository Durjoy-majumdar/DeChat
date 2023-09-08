package com.tencent.p014mm.plugin.exdevice.model;

import java.util.Iterator;
import java.util.LinkedList;
import jq3.C9493c;

/* renamed from: com.tencent.mm.plugin.exdevice.model.l1 */
public class C93366l1 implements C9493c {

    /* renamed from: d */
    public String f269424d;

    /* renamed from: e */
    public String f269425e;

    /* renamed from: f */
    public String f269426f;

    /* renamed from: g */
    public String f269427g;

    /* renamed from: h */
    public String f269428h;

    /* renamed from: i */
    public String f269429i;

    /* renamed from: j */
    public String f269430j;

    /* renamed from: n */
    public boolean f269431n = false;

    /* renamed from: o */
    public int f269432o = 0;

    /* renamed from: p */
    public LinkedList<Integer> f269433p = null;

    /* renamed from: a */
    public boolean mo128152a(int i) {
        LinkedList<Integer> linkedList = this.f269433p;
        if (linkedList != null && !linkedList.isEmpty()) {
            Iterator<Integer> it = linkedList.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public int mo75c() {
        return 1;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
