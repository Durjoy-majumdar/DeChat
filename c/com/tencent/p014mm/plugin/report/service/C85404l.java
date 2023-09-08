package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.plugin.report.service.l */
public class C85404l implements C86011o1 {
    public boolean accept(C86009m1 m1Var) {
        return Pattern.matches("cpu[0-9]", m1Var.getName());
    }
}
