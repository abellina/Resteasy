package org.jboss.resteasy.testi18n;

import java.util.Locale;

/**
 * 
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 * 
 * Copyright Sep 27, 2014
 */
public class TestMessages_en extends TestMessagesAbstract
{  
   @Override
   protected Locale getLocale()
   {
      return new Locale("en");
   }
}