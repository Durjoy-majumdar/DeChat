package c13;

import di3.C86301e;
import ei3.C86522b;
import java.util.concurrent.ConcurrentHashMap;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p592kz.C99273c;
import zt3.C119157j;

@C86522b
/* renamed from: c13.i */
public class C113235i extends C86301e implements C99273c {
    /* renamed from: vZ */
    public void mo138683vZ(String str, C98120c cVar, C98121d dVar) {
        if (!C113234h.f338833b && str != null) {
            if (cVar != null || dVar != null) {
                if (cVar == null) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C113234h.f338835d;
                    h$$c h__c = (h$$c) concurrentHashMap.get(str);
                    if (h__c == null) {
                        h__c = new h$$c();
                        concurrentHashMap.put(str, h__c);
                    }
                    h__c.f338836a++;
                    h__c.f338837b = System.currentTimeMillis();
                }
                if (!str.startsWith("finder")) {
                    ((C119157j) C119157j.f356862d).mo183875f(new h$$a(cVar, str));
                }
            }
        }
    }
}
