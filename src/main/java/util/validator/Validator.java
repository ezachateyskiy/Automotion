package util.validator;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;

interface Validator {
    ResponsiveValidator rootElement(WebElement element, String readableNameOfElement);

    ResponsiveValidator leftElement(WebElement element);

    ResponsiveValidator rightElement(WebElement element);

    ResponsiveValidator aboveElement(WebElement element);

    ResponsiveValidator belowElement(WebElement element);

    ResponsiveValidator inside(WebElement element);

    ResponsiveValidator notOverlapWith(WebElement element, String readableName);

    ResponsiveValidator sameOffsetLeftAs(WebElement element, String readableName);

    ResponsiveValidator sameOffsetRightAs(WebElement element, String readableName);

    ResponsiveValidator minWidth(int width);

    ResponsiveValidator maxWidth(int width);

    ResponsiveValidator minHeight(int height);

    ResponsiveValidator maxHeight(int height);

    ResponsiveValidator minOffset(int top, int right, int bottom, int left);

    ResponsiveValidator maxOffset(int top, int right, int bottom, int left);

    ResponsiveValidator drawMap();

    JSONObject validate();

}
