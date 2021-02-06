package controller;

import model.DepthMap;
import model.Node;
import service.DepthMapService;
import service.TreePrinterService;
import service.TreeService;

public class TreeGeneratorController {
    public String getDiagram(String string) {
        TreeService treeService = new TreeService(string);
        Node tree = treeService.getTree();
        DepthMapService depthMapService = new DepthMapService(tree);
        DepthMap depthMap = depthMapService.getDepthMap();
        TreePrinterService treePrinterService = new TreePrinterService();
        return treePrinterService.getDiagram(depthMap);
    }
}
