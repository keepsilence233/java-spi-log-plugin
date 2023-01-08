package qx.leizige.spi;


import qx.leizige.plugin.base.Plugin;

import java.util.Map;

public class LogPlugin implements Plugin {
    @Override
    public Boolean install(Map<String, Object> context) {
        System.out.println("log plugin install success ... ");
        return true;
    }
}
