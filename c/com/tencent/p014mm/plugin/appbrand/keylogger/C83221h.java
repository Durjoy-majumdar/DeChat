package com.tencent.p014mm.plugin.appbrand.keylogger;

import com.tencent.p014mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.h */
public class C83221h implements Comparator<IKeyStepAnalyser$StepLogInfo> {
    public C83221h(KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity) {
    }

    public int compare(Object obj, Object obj2) {
        int i = (((IKeyStepAnalyser$StepLogInfo) obj).f243057j > ((IKeyStepAnalyser$StepLogInfo) obj2).f243057j ? 1 : (((IKeyStepAnalyser$StepLogInfo) obj).f243057j == ((IKeyStepAnalyser$StepLogInfo) obj2).f243057j ? 0 : -1));
        if (i > 0) {
            return -1;
        }
        return i < 0 ? 1 : 0;
    }
}
