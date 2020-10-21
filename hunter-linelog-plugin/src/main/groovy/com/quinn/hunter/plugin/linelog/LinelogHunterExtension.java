package com.quinn.hunter.plugin.linelog;

import com.quinn.hunter.transform.RunVariant;

/**
 * Created by Quinn on 07/10/2018.
 */
public class LinelogHunterExtension {

    public RunVariant runVariant = RunVariant.ALWAYS;
    public boolean duplicatedClassSafeMode = false;

    @Override
    public String toString() {
        return "LinelogHunterExtension{" +
                "runVariant=" + runVariant +
                ", duplicatedClassSafeMode=" + duplicatedClassSafeMode +
                '}';
    }
}
